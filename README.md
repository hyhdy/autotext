# autotext
## 说明
这是一个实现了文字自动排版功能的输入框，可根据用户输入的文字自动调整每行字体的大小以达到紧凑美观的效果。
类似Instagram的文字编辑功能

## 效果图

### Instagram效果

<img width="30%" src="https://img-blog.csdnimg.cn/20190314094035690.gif"/>


### 本项目实现的效果

1. 正常输入
<img width="30%" src="https://raw.githubusercontent.com/hyhdy/customview-samples/master/img-folder/auto.gif"/>

2. 中英文，数字，表情混合输入
<img width="30%" src="https://github.com/hyhdy/autotext/blob/master/img-folder/multiple.gif"/>

3. 极端输入
<img width="30%" src="https://github.com/hyhdy/autotext/blob/master/img-folder/QQ20200404-0.gif"/>

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
