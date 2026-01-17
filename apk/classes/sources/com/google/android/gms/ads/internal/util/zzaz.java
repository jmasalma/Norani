package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.internal.ads.zzapz;
import com.google.android.gms.internal.ads.zzaqd;
import com.google.android.gms.internal.ads.zzaqg;
import com.google.android.gms.internal.ads.zzaqm;
import com.google.android.gms.internal.ads.zzaqr;
import com.google.android.gms.internal.ads.zzaqs;
import com.google.android.gms.internal.ads.zzaqz;
import com.google.android.gms.internal.ads.zzard;
import com.google.android.gms.internal.ads.zzare;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzbmc;
import com.google.android.gms.internal.ads.zzfqs;
import com.google.android.gms.internal.ads.zzfqt;
import java.io.File;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzaz extends zzaqs {
    private final Context zzb;

    private zzaz(Context context, zzaqr zzaqr) {
        super(zzaqr);
        this.zzb = context;
    }

    public static zzaqg zzb(Context context) {
        zzaqg zzaqg = new zzaqg(new zzaqz(new File(zzfqt.zza(zzfqs.zza(), context.getCacheDir(), "admob_volley")), 20971520), new zzaz(context, new zzare((zzard) null, (SSLSocketFactory) null)), 4);
        zzaqg.zzd();
        return zzaqg;
    }

    public final zzapz zza(zzaqd zzaqd) throws zzaqm {
        if (zzaqd.zza() == 0) {
            if (Pattern.matches((String) zzbd.zzc().zzb(zzbde.zzeK), zzaqd.zzk())) {
                Context context = this.zzb;
                zzbb.zzb();
                if (zzf.zzx(context, 13400000)) {
                    zzapz zza = new zzbmc(context).zza(zzaqd);
                    if (zza != null) {
                        zze.zza("Got gmscore asset response: ".concat(String.valueOf(zzaqd.zzk())));
                        return zza;
                    }
                    zze.zza("Failed to get gmscore asset response: ".concat(String.valueOf(zzaqd.zzk())));
                }
            }
        }
        return zzaz.super.zza(zzaqd);
    }
}
