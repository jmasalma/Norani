package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.zzv;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcqm extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    private final Context zza;
    private View zzb;

    private zzcqm(Context context) {
        super(context);
        this.zza = context;
    }

    public static zzcqm zza(Context context, View view, zzfca zzfca) {
        Resources resources;
        DisplayMetrics displayMetrics;
        zzcqm zzcqm = new zzcqm(context);
        List list = zzfca.zzu;
        if (!(list.isEmpty() || (resources = zzcqm.zza.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null)) {
            zzfcb zzfcb = (zzfcb) list.get(0);
            zzcqm.setLayoutParams(new FrameLayout.LayoutParams((int) (((float) zzfcb.zza) * displayMetrics.density), (int) (((float) zzfcb.zzb) * displayMetrics.density)));
        }
        zzcqm.zzb = view;
        zzcqm.addView(view);
        zzv.zzz();
        zzcas.zzb(zzcqm, zzcqm);
        zzv.zzz();
        zzcas.zza(zzcqm, zzcqm);
        JSONObject jSONObject = zzfca.zzah;
        RelativeLayout relativeLayout = new RelativeLayout(zzcqm.zza);
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        if (optJSONObject != null) {
            zzcqm.zzc(optJSONObject, relativeLayout, 10);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
        if (optJSONObject2 != null) {
            zzcqm.zzc(optJSONObject2, relativeLayout, 12);
        }
        zzcqm.addView(relativeLayout);
        return zzcqm;
    }

    private final int zzb(double d) {
        zzbb.zzb();
        return zzf.zzC(this.zza, (int) d);
    }

    private final void zzc(JSONObject jSONObject, RelativeLayout relativeLayout, int i) {
        TextView textView = new TextView(this.zza);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int zzb2 = zzb(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, zzb2, 0, zzb2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, zzb(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i);
        relativeLayout.addView(textView, layoutParams);
    }

    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.zzb.setY((float) (-iArr[1]));
    }

    public final void onScrollChanged() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.zzb.setY((float) (-iArr[1]));
    }
}
