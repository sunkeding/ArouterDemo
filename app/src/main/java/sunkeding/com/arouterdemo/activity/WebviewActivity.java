package sunkeding.com.arouterdemo.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

import sunkeding.com.arouterdemo.R;
import sunkeding.com.arouterdemo.implicitjump.util.RouterJumpUtil;

@Route(path = "/test/webview")
public class WebviewActivity extends Activity {

    WebView mWebView;
    @Autowired
    String url = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_webview);
        mWebView = (WebView) findViewById(R.id.webview);

        //这句话配合@Autowired能够自动解析出参数
        ARouter.getInstance().inject(this);
        Log.d("WebviewActivity", "自动解析url=" + url);
        mWebView.loadUrl(url);
        WebSettings webSettings = mWebView.getSettings();

        // 设置与Js交互的权限
        webSettings.setJavaScriptEnabled(true);
        // 设置允许JS弹窗
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
        mWebView.setWebViewClient(new WebViewClient() {


            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                Log.d("WebviewActivity", url);
                // TODO: 2018/10/14 这里直接做特殊拦截，实际上是需要根据自己项目的业务逻辑来实现的
                String[] urls = {
                        "skdscheme://www.skd.com/filter/action?studentId=100&teacherId=200",
                        "skdscheme://www.skd.com/filterold/action?studentId=100&teacherId=200",
                };
                for (String s : urls) {
                    if (s.equals(url)) {
                        RouterJumpUtil.goRouter(WebviewActivity.this, url);
                        return true;
                    }
                }
                return super.shouldOverrideUrlLoading(view, url);
            }
        });
    }
}
