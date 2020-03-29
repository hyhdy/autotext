# autotext
## 说明
这是一个实现了文字自动排版功能的输入框，可根据用户输入的文字自动调整每行字体的大小以达到紧凑美观的效果。

## 效果图

Instagram效果图

<img src="https://img-blog.csdnimg.cn/20190316082607240.gif"/>


本项目实现的效果图

<img src="https://img-blog.csdnimg.cn/20190314094035690.gif"/>

## 快速接入
1. 在build.gradle添加依赖
```
dependencies {

    implementation 'com.hyh:autotext:1.0.0'
    
}
```
2. 在需要实现文字自动排版功能的地方直接使用AutoEditText替代EditText就可以。具体可看sample项目。

## 实现原理
参考博客：https://blog.csdn.net/hyhlmy/article/details/88545104
