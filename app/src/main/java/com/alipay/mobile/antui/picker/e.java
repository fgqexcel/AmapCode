package com.alipay.mobile.antui.picker;

import com.alipay.mobile.antui.picker.AUWheelView.OnWheelViewListener;
import com.alipay.mobile.antui.utils.DateUtils;
import java.util.List;

/* compiled from: AUDatePicker */
final class e implements OnWheelViewListener {
    final /* synthetic */ AUWheelView a;
    final /* synthetic */ AUDatePicker b;

    e(AUDatePicker this$0, AUWheelView aUWheelView) {
        this.b = this$0;
        this.a = aUWheelView;
    }

    public final void onSelected(boolean isUserScroll, int selectedIndex, String item) {
        this.b.selectedYearIndex = selectedIndex;
        this.b.days.clear();
        int maxDays = DateUtils.calculateDaysInMonth(this.b.stringToYearMonthDay(item), this.b.stringToYearMonthDay((String) this.b.months.get(this.b.selectedMonthIndex)));
        for (int i = 1; i <= maxDays; i++) {
            this.b.days.add(DateUtils.fillZero(i));
        }
        if (this.b.selectedDayIndex >= maxDays) {
            this.b.selectedDayIndex = this.b.days.size() - 1;
        }
        this.a.setItems((List<String>) this.b.days, this.b.selectedDayIndex);
    }
}
