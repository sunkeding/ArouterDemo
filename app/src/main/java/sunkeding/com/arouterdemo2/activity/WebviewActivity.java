package sunkeding.com.arouterdemo2.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

import sunkeding.com.arouterdemo2.R;

@Route(path = "/test/webview")
public class WebviewActivity extends Activity {

    WebView webview;
    @Autowired
    String url = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_webview);
        webview = (WebView) findViewById(R.id.webview);

        //这句话配合@Autowired能够自动解析出参数
        ARouter.getInstance().inject(this);
        Log.d("WebviewActivity", "自动解析url=" + url);
        webview.loadUrl(url);
    }
}
