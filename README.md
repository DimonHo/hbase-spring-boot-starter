
- 快速使用：
```xml
<dependency>
    <groupId>com.wd.starter</groupId>
    <artifactId>hbase-spring-boot-starter</artifactId>
    <version>2.0.0-SNAPSHOT</version>
</dependency>
```


- 配置示例：
```yml
hbase:
  config:
    hbase.zookeeper.quorum: ${hbaseZookeeperQuorum:192.168.1.61,192.168.1.62,192.168.1.63,192.168.1.64,192.168.1.65}
    hbase.zookeeper.property.clientPort: ${hbaseZookeeperPort:2181}
    hbase.client.scanner.timeout.period: 180000  # 180s
    hbase.rpc.timeout: 120000 # RPC请求的超时时间：120s
    hbase.client.keyvalue.maxsize: 0
    hbase.client.retries.number: 3  # 失败时重试次数
    hbase.client.pause: 100 #重试等待时间
    hbase.client.operation.timeout: 1200000  # HBase客户端发起一次数据操作直至得到响应之间总的超时时间
    hbase.regionserver.lease.period: 240000
```