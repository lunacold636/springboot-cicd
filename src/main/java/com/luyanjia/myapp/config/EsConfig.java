package com.luyanjia.myapp.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

/**
 * @Author Yanjia.Lu
 * @Date 2024/12/31 3:07
 * @description
 **/
@Configuration
public class EsConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger(EsConfig.class);

//    @Value("${elasticsearch.cluster_host:}")
//    private String clusterHost;
//
//    @Value("${elasticsearch.cluster_port:9200}")
//    private Integer clusterPort;
//
//    @Value("${elasticsearch.username:}")
//    private String username;
//
//    @Value("${elasticsearch.password:}")
//    private String password;
//    @Bean(name = "restHighLevelClient")
//    public RestHighLevelClient restHighLevelClient() {
//        // 阿里云Elasticsearch集群需要basic auth验证。
//        final CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
//        // 访问用户名和密码,创建阿里云Elasticsearch实例时设置的用户名和密码，也是Kibana控制台的登录用户名和密码。
//        credentialsProvider.setCredentials(AuthScope.ANY, new UsernamePasswordCredentials(this.username, this.password));
//        // 通过builder创建rest client，配置http client的HttpClientConfigCallback。
//        // 单击所创建的Elasticsearch实例ID，在基本信息页面获取公网地址，即为ES集群地址。
//        RestClientBuilder builder = RestClient.builder(new HttpHost(this.clusterHost, this.clusterPort))
//                .setHttpClientConfigCallback(httpClientBuilder -> httpClientBuilder.setDefaultCredentialsProvider(credentialsProvider));
//        // RestHighLevelClient实例通过REST low-level client builder进行构造。
//        RestHighLevelClient highClient = new RestHighLevelClient(builder);
//        LOGGER.info("EsConfig.RestHighLevelClient init successfully...");
//        return highClient;
//    }
}


