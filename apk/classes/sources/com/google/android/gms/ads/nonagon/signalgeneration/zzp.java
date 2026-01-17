package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbfj;
import com.google.android.gms.internal.ads.zzdsd;
import com.google.android.gms.internal.ads.zzdso;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzp extends QueryInfoGenerationCallback {
    private final zzo zza;
    private final zzdso zzb;
    private final boolean zzc;
    private final int zzd;
    private final long zze = zzv.zzD().currentTimeMillis();
    private final Boolean zzf;

    public zzp(zzo zzo, boolean z, int i, Boolean bool, zzdso zzdso) {
        this.zza = zzo;
        this.zzc = z;
        this.zzd = i;
        this.zzf = bool;
        this.zzb = zzdso;
    }

    private static long zza() {
        return zzv.zzD().currentTimeMillis() + ((Long) zzbfj.zzh.zze()).longValue();
    }

    private final long zzb() {
        return zzv.zzD().currentTimeMillis() - this.zze;
    }

    public final void onFailure(String str) {
        String str2;
        Pair[] pairArr = new Pair[9];
        pairArr[0] = new Pair("sgf_reason", str);
        pairArr[1] = new Pair("se", "query_g");
        pairArr[2] = new Pair("ad_format", AdFormat.BANNER.name());
        pairArr[3] = new Pair("rtype", Integer.toString(6));
        pairArr[4] = new Pair("scar", "true");
        pairArr[5] = new Pair("lat_ms", Long.toString(zzb()));
        int i = this.zzd;
        pairArr[6] = new Pair("sgpc_rn", Integer.toString(i));
        pairArr[7] = new Pair("sgpc_lsu", String.valueOf(this.zzf));
        boolean z = this.zzc;
        if (true != z) {
            str2 = "0";
        } else {
            str2 = "1";
        }
        pairArr[8] = new Pair("tpc", str2);
        zzaa.zzd(this.zzb, (zzdsd) null, "sgpcf", pairArr);
        this.zza.zzf(z, new zzq((QueryInfo) null, str, zza(), i));
    }

    public final void onSuccess(QueryInfo queryInfo) {
        String str;
        Pair[] pairArr = new Pair[8];
        pairArr[0] = new Pair("se", "query_g");
        pairArr[1] = new Pair("ad_format", AdFormat.BANNER.name());
        pairArr[2] = new Pair("rtype", Integer.toString(6));
        pairArr[3] = new Pair("scar", "true");
        pairArr[4] = new Pair("lat_ms", Long.toString(zzb()));
        int i = this.zzd;
        pairArr[5] = new Pair("sgpc_rn", Integer.toString(i));
        pairArr[6] = new Pair("sgpc_lsu", String.valueOf(this.zzf));
        boolean z = this.zzc;
        if (true != z) {
            str = "0";
        } else {
            str = "1";
        }
        pairArr[7] = new Pair("tpc", str);
        zzaa.zzd(this.zzb, (zzdsd) null, "sgpcs", pairArr);
        this.zza.zzf(z, new zzq(queryInfo, "", zza(), i));
    }
}
