package sunkeding.com.arouterdemo.arouter.activity;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.callback.NavCallback;
import com.alibaba.android.arouter.launcher.ARouter;

import java.util.Iterator;
import java.util.Set;

public class SchemeFilterActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        直接通过ARouter处理外部Uri
        Uri uri = getIntent().getData();
        if (uri == null) {
            return;
        }
        Log.d("SchemeFilterActivity", "外部uri:" + uri);
//        Log.d("SchemeFilterActivity", uri.getScheme());
//        Log.d("SchemeFilterActivity", uri.getHost());
//        Log.d("SchemeFilterActivity", uri.getPath());
//        Log.d("SchemeFilterActivity", uri.getQuery());
//        Log.d("SchemeFilterActivity", uri.getLastPathSegment());
//        Log.d("SchemeFilterActivity", uri.getQueryParameter("actionId"));

        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Bundle bundle = new Bundle();

        if (queryParameterNames != null) {
            Iterator<String> iterator = queryParameterNames.iterator();
            while (iterator.hasNext()) {
                //遍历key
                String key = iterator.next();
                //根据key遍历value
                String value = uri.getQueryParameter(key);
                Log.d("SchemeFilterActivity", "key:" + key + "\n" + "value=" + value);
                //网页过来的参数值只能是以字符串去接收的
                bundle.putString(key, value);
            }
        }

        ARouter.getInstance().build(uri).with(bundle).navigation(this, new NavCallback() {
            @Override
            public void onArrival(Postcard postcard) {
                finish();
            }
        });
    }
}
