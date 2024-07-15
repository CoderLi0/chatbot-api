import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ApiTest {
    @Test
   public void query_unanswered_questions() throws IOException {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        HttpGet get = new HttpGet("https://user.qzone.qq.com/proxy/domain/m.qzone.qq.com/cgi-bin/new/get_msgb?uin=319124700&hostUin=319124700&start=0&s=0.05973999359052673&format=jsonp&num=10&inCharset=utf-8&outCharset=utf-8&g_tk=1836279432&g_tk=1836279432");

        get.addHeader("cookie","pgv_pvid=6569750048; ptcz=dc0e2ae696b7578ab41b6bc1458a945b8a60ce1552fc703830ea5ef3f4646350; _qimei_uuid42=17c190d2f1f10037e55e3b34ecaddec32a168031cc; _qimei_fingerprint=b70f7d197f7b1773d7b91fd53d758983; _qimei_q36=; o_cookie=2689626785; eas_sid=g1o7m1O8C2F4a9z6M8x7T5G576; fqm_pvqid=388a4cf3-68b6-4842-b341-062d8dd5dec4; ptui_loginuin=319124700; LW_sid=G1U7W2p0r1q0q5F9z3i0v3S4O3; _qimei_h38=f4d17c3ce55e3b34ecaddec30200000ea17c19; RK=zJVYvJii6j; Loading=Yes; pgv_info=ssid=s3770578212; uin=o0319124700; skey=@b2mU6Mdws; p_uin=o0319124700; pt4_token=fZasyvXUJ5sRb*k9WflcDieYx9b0U5DfjKMOydZS9ls_; p_skey=gey5-LK407O2FRbS-R*K5S7ggyc6xFa56nu0UUCahjM_; qz_screen=2048x1152; 319124700_todaycount=0; 319124700_totalcount=28; __Q_w_s_hat_seed=1; QZ_FE_WEBP_SUPPORT=1; cpu_performance_v8=1");

        get.addHeader("Content-type","application/x-javascript; charset=utf-8");

        CloseableHttpResponse response = httpClient.execute(get);

        if(response.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
            String res = EntityUtils.toString(response.getEntity());
            System.out.println(res);
        }else{
            System.out.println(response.getStatusLine().getStatusCode());
        }

    }
//    @Test
//    public void answer() throws IOException {
//        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
//
//        HttpPost post = new HttpPost("https://h5.qzone.qq.com/proxy/domain/m.qzone.qq.com/cgi-bin/new/add_reply?&g_tk=1836279432");
//
//        post.addHeader("cookie","pgv_pvid=6569750048; ptcz=dc0e2ae696b7578ab41b6bc1458a945b8a60ce1552fc703830ea5ef3f4646350; _qimei_uuid42=17c190d2f1f10037e55e3b34ecaddec32a168031cc; _qimei_fingerprint=b70f7d197f7b1773d7b91fd53d758983; _qimei_q36=; o_cookie=2689626785; eas_sid=g1o7m1O8C2F4a9z6M8x7T5G576; fqm_pvqid=388a4cf3-68b6-4842-b341-062d8dd5dec4; ptui_loginuin=319124700; LW_sid=G1U7W2p0r1q0q5F9z3i0v3S4O3; _qimei_h38=f4d17c3ce55e3b34ecaddec30200000ea17c19; RK=zJVYvJii6j; Loading=Yes; pgv_info=ssid=s3770578212; uin=o0319124700; skey=@b2mU6Mdws; p_uin=o0319124700; pt4_token=fZasyvXUJ5sRb*k9WflcDieYx9b0U5DfjKMOydZS9ls_; p_skey=gey5-LK407O2FRbS-R*K5S7ggyc6xFa56nu0UUCahjM_; qz_screen=2048x1152; 319124700_todaycount=0; 319124700_totalcount=28; __Q_w_s_hat_seed=1; QZ_FE_WEBP_SUPPORT=1; cpu_performance_v8=1");
//
//        post.addHeader("Content-type","text/html; charset=utf-8");
//
//        List<NameValuePair> formParams = new ArrayList<>();
//        formParams.add(new BasicNameValuePair("hostUin", "319124700"));
//        formParams.add(new BasicNameValuePair("msgId", "1000050000"));
//
//        post.setEntity(FormDa);
//
//        String paramJson = "1";
//
//        CloseableHttpResponse response = httpClient.execute(post);
//
//        if(response.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
//            String res = EntityUtils.toString(response.getEntity());
//            System.out.println(res);
//        }else{
//            System.out.println(response.getStatusLine().getStatusCode());
//        }
//
//    }
}

