package gdou.gdou_chb.util;

import com.kymjs.rxvolley.RxVolley;
import com.kymjs.rxvolley.client.HttpCallback;
import com.kymjs.rxvolley.client.HttpParams;
import com.kymjs.rxvolley.rx.Result;

import rx.Observable;


/**
 * RxVoller的工具类
 */
public class RxVolleyUtils {


    private static RxVolleyUtils rxVolleyUtils;

    private  HttpParams params;
    private  String url;
    private  HttpCallback callback;

    /**
     * 单例
     * @return RxVolleyUtils
     */
    public static RxVolleyUtils getInstance() {
        return null == rxVolleyUtils? new RxVolleyUtils() : rxVolleyUtils;
    }

    private RxVolleyUtils(){

    }

    /**
     * get请求
     * @param url
     * @param params
     * @return
     */
    public Observable<Result> get(String url,HttpParams params){
        if (params == null){
            params =new HttpParams();
        }
        this.url = url;
        return new RxVolley
                .Builder()
                .httpMethod(RxVolley.Method.GET)
                .params(params)
                .url(url)
                .contentType(RxVolley.ContentType.JSON)
                .getResult();
    }

    /**
     * post请求
     * @param url
     * @param params
     * @return
     */
    public Observable<Result> post(String url,HttpParams params){
        if (params == null){
            params =new HttpParams();
        }
        this.url = url;
        return new RxVolley
                .Builder()
                .params(params)
                .url(url)
                .httpMethod(RxVolley.Method.POST)
                .contentType(RxVolley.ContentType.JSON)
                .getResult();
    }



    /**
     * delete请求
     * @param url
     * @param params
     * @return
     */
    public Observable<Result> delete(String url,HttpParams params){
        if (params == null){
            params =new HttpParams();
        }
        this.url = url;
        return new RxVolley
                .Builder()
                .params(params)
                .url(url)
                .httpMethod(RxVolley.Method.DELETE)
                .contentType(RxVolley.ContentType.JSON)
                .getResult();
    }


}

