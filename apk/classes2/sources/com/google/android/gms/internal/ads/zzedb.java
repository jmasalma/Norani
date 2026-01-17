package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzedb implements zzedc {
    static /* synthetic */ zzedh zzc(String str, String str2, String str3, zzedd zzedd, String str4, WebView webView, String str5, String str6, zzede zzede) {
        zzfly zza = zzfly.zza("Google", str2);
        zzflx zzp = zzp("javascript");
        zzflq zzn = zzn(zzedd.toString());
        zzflx zzflx = zzflx.NONE;
        if (zzp == zzflx) {
            int i = zze.zza;
            zzo.zzj("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        } else if (zzn == null) {
            String valueOf = String.valueOf(String.valueOf(zzedd));
            int i2 = zze.zza;
            zzo.zzj("Omid html session error; Unable to parse creative type: ".concat(valueOf));
            return null;
        } else {
            zzflx zzp2 = zzp(str4);
            if (zzn == zzflq.VIDEO && zzp2 == zzflx) {
                String valueOf2 = String.valueOf(str4);
                int i3 = zze.zza;
                zzo.zzj("Omid html session error; Video events owner unknown for video creative: ".concat(valueOf2));
                return null;
            }
            zzfln zzb = zzfln.zzb(zza, webView, str5, "");
            return new zzedh(zzfll.zza(zzflm.zza(zzn, zzo(zzede.toString()), zzp, zzp2, true), zzb), zzb);
        }
    }

    static /* synthetic */ zzedh zzd(String str, String str2, String str3, String str4, zzedd zzedd, WebView webView, String str5, String str6, zzede zzede) {
        zzfly zza = zzfly.zza(str, str2);
        zzflx zzp = zzp("javascript");
        zzflx zzp2 = zzp(str4);
        zzflq zzn = zzn(zzedd.toString());
        zzflx zzflx = zzflx.NONE;
        if (zzp == zzflx) {
            int i = zze.zza;
            zzo.zzj("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        } else if (zzn == null) {
            String valueOf = String.valueOf(String.valueOf(zzedd));
            int i2 = zze.zza;
            zzo.zzj("Omid js session error; Unable to parse creative type: ".concat(valueOf));
            return null;
        } else if (zzn == zzflq.VIDEO && zzp2 == zzflx) {
            String valueOf2 = String.valueOf(str4);
            int i3 = zze.zza;
            zzo.zzj("Omid js session error; Video events owner unknown for video creative: ".concat(valueOf2));
            return null;
        } else {
            zzfln zzc = zzfln.zzc(zza, webView, str5, "");
            return new zzedh(zzfll.zza(zzflm.zza(zzn, zzo(zzede.toString()), zzp, zzp2, true), zzc), zzc);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.ads.zzflq zzn(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -382745961(0xffffffffe92fc297, float:-1.3280059E25)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L_0x002a
            r1 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r0 == r1) goto L_0x0020
            r1 = 714893483(0x2a9c68ab, float:2.7783795E-13)
            if (r0 == r1) goto L_0x0016
            goto L_0x0034
        L_0x0016:
            java.lang.String r0 = "nativeDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = r3
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "video"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = r2
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "htmlDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 0
            goto L_0x0035
        L_0x0034:
            r4 = -1
        L_0x0035:
            if (r4 == 0) goto L_0x0043
            if (r4 == r3) goto L_0x0040
            if (r4 == r2) goto L_0x003d
            r4 = 0
            return r4
        L_0x003d:
            com.google.android.gms.internal.ads.zzflq r4 = com.google.android.gms.internal.ads.zzflq.VIDEO
            return r4
        L_0x0040:
            com.google.android.gms.internal.ads.zzflq r4 = com.google.android.gms.internal.ads.zzflq.NATIVE_DISPLAY
            return r4
        L_0x0043:
            com.google.android.gms.internal.ads.zzflq r4 = com.google.android.gms.internal.ads.zzflq.HTML_DISPLAY
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzedb.zzn(java.lang.String):com.google.android.gms.internal.ads.zzflq");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.ads.zzflt zzo(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -1104128070(0xffffffffbe3057ba, float:-0.17220965)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L_0x002a
            r1 = 1318088141(0x4e906dcd, float:1.2115575E9)
            if (r0 == r1) goto L_0x0020
            r1 = 1988248512(0x768243c0, float:1.3210405E33)
            if (r0 == r1) goto L_0x0016
            goto L_0x0034
        L_0x0016:
            java.lang.String r0 = "onePixel"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = r2
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "definedByJavascript"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = r3
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "beginToRender"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 0
            goto L_0x0035
        L_0x0034:
            r4 = -1
        L_0x0035:
            if (r4 == 0) goto L_0x0044
            if (r4 == r3) goto L_0x0041
            if (r4 == r2) goto L_0x003e
            com.google.android.gms.internal.ads.zzflt r4 = com.google.android.gms.internal.ads.zzflt.UNSPECIFIED
            goto L_0x0046
        L_0x003e:
            com.google.android.gms.internal.ads.zzflt r4 = com.google.android.gms.internal.ads.zzflt.ONE_PIXEL
            goto L_0x0046
        L_0x0041:
            com.google.android.gms.internal.ads.zzflt r4 = com.google.android.gms.internal.ads.zzflt.DEFINED_BY_JAVASCRIPT
            goto L_0x0046
        L_0x0044:
            com.google.android.gms.internal.ads.zzflt r4 = com.google.android.gms.internal.ads.zzflt.BEGIN_TO_RENDER
        L_0x0046:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzedb.zzo(java.lang.String):com.google.android.gms.internal.ads.zzflt");
    }

    private static zzflx zzp(String str) {
        if ("native".equals(str)) {
            return zzflx.NATIVE;
        }
        if ("javascript".equals(str)) {
            return zzflx.JAVASCRIPT;
        }
        return zzflx.NONE;
    }

    private static final Object zzq(zzeda zzeda) {
        try {
            return zzeda.zza();
        } catch (RuntimeException e) {
            zzv.zzp().zzv(e, "omid exception");
            return null;
        }
    }

    private static final void zzr(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e) {
            zzv.zzp().zzv(e, "omid exception");
        }
    }

    public final zzedh zza(String str, WebView webView, String str2, String str3, String str4, zzede zzede, zzedd zzedd, String str5) {
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzfz)).booleanValue() || !zzflj.zzb()) {
            return null;
        }
        return (zzedh) zzq(new zzecq("Google", str, "javascript", zzedd, str4, webView, str5, "", zzede));
    }

    public final zzedh zzb(String str, WebView webView, String str2, String str3, String str4, String str5, zzede zzede, zzedd zzedd, String str6) {
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzfz)).booleanValue() || !zzflj.zzb()) {
            return null;
        }
        return (zzedh) zzq(new zzect(str5, str, "javascript", str4, zzedd, webView, str6, "", zzede));
    }

    public final zzflw zze(VersionInfoParcel versionInfoParcel, WebView webView, boolean z) {
        return (zzflw) zzq(new zzecy(versionInfoParcel, webView, true));
    }

    public final String zzf(Context context) {
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzfz)).booleanValue()) {
            return null;
        }
        return (String) zzq(new zzecw());
    }

    public final void zzg(zzfll zzfll, View view) {
        zzr(new zzecp(zzfll, view));
    }

    public final void zzh(zzflw zzflw, View view) {
        zzr(new zzecv(zzflw, view));
    }

    public final void zzi(zzfll zzfll) {
        zzr(new zzecz(zzfll));
    }

    public final void zzj(zzfll zzfll, View view) {
        zzr(new zzecr(zzfll, view));
    }

    public final void zzk(zzfll zzfll) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzfz)).booleanValue() && zzflj.zzb()) {
            Objects.requireNonNull(zzfll);
            zzr(new zzecs(zzfll));
        }
    }

    public final boolean zzl(Context context) {
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzfz)).booleanValue()) {
            int i = zze.zza;
            zzo.zzj("Omid flag is disabled");
            return false;
        }
        Boolean bool = (Boolean) zzq(new zzecu(context));
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final void zzm(zzflw zzflw, zzcfx zzcfx) {
        zzr(new zzecx(zzflw, zzcfx));
    }
}
