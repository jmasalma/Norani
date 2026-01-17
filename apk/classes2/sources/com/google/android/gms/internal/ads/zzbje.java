package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzbje implements zzbkf {
    public final void zza(Object obj, Map map) {
        zzcgn zzcgn = (zzcgn) obj;
        zzbkf zzbkf = zzbke.zza;
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zziE)).booleanValue()) {
            int i = zze.zza;
            zzo.zzj("canOpenAppGmsgHandler disabled.");
            return;
        }
        String str = (String) map.get("package_name");
        if (TextUtils.isEmpty(str)) {
            int i2 = zze.zza;
            zzo.zzj("Package name missing in canOpenApp GMSG.");
            return;
        }
        HashMap hashMap = new HashMap();
        Boolean valueOf = Boolean.valueOf(zzcgn.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
        hashMap.put(str, valueOf);
        zze.zza("/canOpenApp;" + str + ";" + valueOf);
        ((zzbna) zzcgn).zzd("openableApp", hashMap);
    }
}
