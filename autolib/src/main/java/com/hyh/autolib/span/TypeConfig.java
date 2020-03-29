package com.hyh.autolib.span;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import static com.hyh.autolib.span.TypeConfig.AlignType.ALIGN_BOTTOM;
import static com.hyh.autolib.span.TypeConfig.AlignType.ALIGN_CENTER;
import static com.hyh.autolib.span.TypeConfig.AlignType.ALIGN_TOP;
import static com.hyh.autolib.span.TypeConfig.SpanType.TYPE_CUSTOM_TEXT_SPAN;
import static com.hyh.autolib.span.TypeConfig.SpanType.TYPE_ABS_SIZE_SPAN;

/**
 * Created by hyh on 2019/3/6 22:18
 * E-Mail Address：fjnuhyh122@gmail.com
 */
public class TypeConfig {
    public static final int UNIT_SP = 0;
    public static final int UNIT_PX = 1;
    @IntDef({UNIT_SP,UNIT_PX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Unit{};


    @IntDef({TYPE_CUSTOM_TEXT_SPAN,TYPE_ABS_SIZE_SPAN})
    @Retention(RetentionPolicy.SOURCE)
    public @interface SpanType{
        int TYPE_CUSTOM_TEXT_SPAN = 0;//自定义文本span -> CustomTextSpan
        int TYPE_ABS_SIZE_SPAN = 1;//固定字体大小span -> AbsoluteSizeSpan
    };


    @IntDef({ALIGN_BOTTOM,ALIGN_CENTER,ALIGN_TOP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface AlignType{
        int ALIGN_BOTTOM = 0;
        int ALIGN_CENTER = 1;
        int ALIGN_TOP = 2;
    };
}
