package com.amap.bundle.webview.uc;

import android.webkit.ValueCallback;
import com.amap.bundle.logs.AMapLog;
import com.uc.webview.export.utility.SetupTask;

public class UCInitializer$5 implements ValueCallback<SetupTask> {
    final /* synthetic */ long val$begin;

    public UCInitializer$5(long j) {
        this.val$begin = j;
    }

    public final void onReceiveValue(SetupTask setupTask) {
        StringBuilder sb = new StringBuilder("UCCore resume finished:");
        sb.append(System.currentTimeMillis() - this.val$begin);
        AMapLog.i("UCCore.init", sb.toString());
    }
}
