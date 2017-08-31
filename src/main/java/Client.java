import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

import javax.xml.namespace.QName;

/**
 * Created by donghao on 2017/8/30.
 */
public class Client {

    public static void main(String[] args) {
        //服务地址
        String bipEndpoint = "http://localhost:8080/soap/ReceiveFileService?wsdl";
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        org.apache.cxf.endpoint.Client client = dcf.createClient(bipEndpoint);
        Object[] objects;
        String result = "";
        try {
            //命名空间:http://webservice.dh.com/  ,sayHello:方法,hello:方法的入参
            objects = client.invoke(new QName("http://webservice.dh.com/", "sayHello"),"hello");
            //objects = client.invoke( "sayHello");
            result = objects[0].toString();// 远程调用
            // 输出调用结果
            System.out.println("接口服务返回数据：\n" + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
