
测试Arouter跳转：

不能注释SchemeFilterActivity，这个类作中转作用


测试隐式跳转:
此时注释掉SchemeFilterActivity，不注释的话从网页打开会选择多个页面的，因为只要写了  <category android:name="android.intent.category.BROWSABLE" />，就会被网页打开
