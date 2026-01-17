package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzb;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdkp {
    private final zzdpj zza;
    private final zzdny zzb;
    private ViewTreeObserver.OnScrollChangedListener zzc = null;

    public zzdkp(zzdpj zzdpj, zzdny zzdny) {
        this.zza = zzdpj;
        this.zzb = zzdny;
    }

    public static /* synthetic */ void zzb(zzdkp zzdkp, WindowManager windowManager, View view, zzcfg zzcfg, Map map) {
        int i = zze.zza;
        zzo.zze("Hide native ad policy validator overlay.");
        zzcfg.zzF().setVisibility(8);
        if (zzcfg.zzF().getWindowToken() != null) {
            windowManager.removeView(zzcfg.zzF());
        }
        zzcfg.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (zzdkp.zzc != null && viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(zzdkp.zzc);
        }
    }

    public static /* synthetic */ void zzc(zzdkp zzdkp, View view, WindowManager windowManager, zzcfg zzcfg, Map map) {
        int i;
        zzcfg.zzN().zzC(new zzdkn(zzdkp, map));
        if (map != null) {
            Context context = view.getContext();
            int zzf = zzf(context, (String) map.get("validator_width"), ((Integer) zzbd.zzc().zzb(zzbde.zziw)).intValue());
            int zzf2 = zzf(context, (String) map.get("validator_height"), ((Integer) zzbd.zzc().zzb(zzbde.zzix)).intValue());
            int zzf3 = zzf(context, (String) map.get("validator_x"), 0);
            int zzf4 = zzf(context, (String) map.get("validator_y"), 0);
            zzcfg.zzaj(zzchd.zzb(zzf, zzf2));
            try {
                zzcfg.zzG().getSettings().setUseWideViewPort(((Boolean) zzbd.zzc().zzb(zzbde.zziy)).booleanValue());
                zzcfg.zzG().getSettings().setLoadWithOverviewMode(((Boolean) zzbd.zzc().zzb(zzbde.zziz)).booleanValue());
            } catch (NullPointerException unused) {
            }
            WindowManager.LayoutParams zzb2 = zzbv.zzb();
            zzb2.x = zzf3;
            zzb2.y = zzf4;
            windowManager.updateViewLayout(zzcfg.zzF(), zzb2);
            String str = (String) map.get("orientation");
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect)) {
                if ("1".equals(str) || "2".equals(str)) {
                    i = rect.bottom;
                } else {
                    i = rect.top;
                }
                zzdkp.zzc = new zzdko(view, zzcfg, str, zzb2, i - zzf4, windowManager);
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnScrollChangedListener(zzdkp.zzc);
                }
            }
            String str2 = (String) map.get("overlay_url");
            if (!TextUtils.isEmpty(str2)) {
                zzcfg.loadUrl(str2);
            }
        }
    }

    public static /* synthetic */ void zzd(zzdkp zzdkp, Map map, boolean z, int i, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "validatorHtmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        zzdkp.zzb.zzj("sendMessageToNativeJs", hashMap);
    }

    private static final int zzf(Context context, String str, int i) {
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        zzbb.zzb();
        return zzf.zzC(context, i);
    }

    public final View zza(View view, WindowManager windowManager) throws zzcfs {
        zzcfg zza2 = this.zza.zza(zzr.zzc(), (zzfca) null, (zzfcd) null);
        zza2.zzF().setVisibility(4);
        zza2.zzF().setContentDescription("policy_validator");
        zza2.zzag("/sendMessageToSdk", new zzdkj(this));
        zza2.zzag("/hideValidatorOverlay", new zzdkk(this, windowManager, view));
        zza2.zzag("/open", new zzbkr((zzb) null, (zzbso) null, (zzeca) null, (zzdsj) null, (zzcmq) null));
        WeakReference weakReference = new WeakReference(zza2);
        zzdkl zzdkl = new zzdkl(this, view, windowManager);
        zzdny zzdny = this.zzb;
        zzdny.zzm(weakReference, "/loadNativeAdPolicyViolations", zzdkl);
        zzdny.zzm(new WeakReference(zza2), "/showValidatorOverlay", new zzdkm());
        return zza2.zzF();
    }
}
