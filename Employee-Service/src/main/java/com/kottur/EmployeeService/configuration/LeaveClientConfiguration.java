package com.kottur.EmployeeService.configuration;

import com.kottur.EmployeeService.leaveClient.LeaveClient;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.client.loadbalancer.reactive.LoadBalancedExchangeFilterFunction;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
@RequiredArgsConstructor
public class LeaveClientConfiguration {

    private final LoadBalancedExchangeFilterFunction filterFunction;

    public WebClient leaveWebClient(){
        return  WebClient.builder()
                .baseUrl("http://leave-service")
                .filter(filterFunction)
                .build();
    }

    @Bean
    public LeaveClient leaveClient(){
        var httpProxyFactory = HttpServiceProxyFactory.builder(WebClientAdapter.forClient(leaveWebClient()))
                .build();
        return httpProxyFactory.createClient(LeaveClient.class);
    }
}
