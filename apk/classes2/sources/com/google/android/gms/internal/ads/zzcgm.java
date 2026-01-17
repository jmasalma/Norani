package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcgm {
    private final zzcgn zza;
    private final zzcgl zzb;

    public zzcgm(zzcgn zzcgn, zzcgl zzcgl) {
        this.zzb = zzcgl;
        this.zza = zzcgn;
    }

    public static /* synthetic */ void zza(zzcgm zzcgm, String str) {
        Uri parse = Uri.parse(str);
        zzcfo zzaO = ((zzcgf) zzcgm.zzb.zza).zzaO();
        if (zzaO == null) {
            int i = zze.zza;
            zzo.zzg("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
            return;
        }
        zzaO.zzn(parse);
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            zze.zza("Click string is empty, not proceeding.");
            return "";
        }
        zzcgn zzcgn = this.zza;
        zzavu zzI = ((zzcgt) zzcgn).zzI();
        if (zzI == null) {
            zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzavp zzc = zzI.zzc();
        if (zzc == null) {
            zze.zza("Signals object is empty, ignoring.");
            return "";
        } else if (zzcgn.getContext() != null) {
            return zzc.zze(zzcgn.getContext(), str, ((zzcgv) zzcgn).zzF(), zzcgn.zzi());
        } else {
            zze.zza("Context is null, ignoring.");
            return "";
        }
    }

    @JavascriptInterface
    public String getViewSignals() {
        zzcgn zzcgn = this.zza;
        zzavu zzI = ((zzcgt) zzcgn).zzI();
        if (zzI == null) {
            zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzavp zzc = zzI.zzc();
        if (zzc == null) {
            zze.zza("Signals object is empty, ignoring.");
            return "";
        } else if (zzcgn.getContext() != null) {
            return zzc.zzh(zzcgn.getContext(), ((zzcgv) zzcgn).zzF(), zzcgn.zzi());
        } else {
            zze.zza("Context is null, ignoring.");
            return "";
        }
    }

    @JavascriptInterface
    public void notify(String str) {
        if (TextUtils.isEmpty(str)) {
            int i = zze.zza;
            zzo.zzj("URL is empty, ignoring message");
            return;
        }
        zzs.zza.post(new zzcgk(this, str));
    }
}
