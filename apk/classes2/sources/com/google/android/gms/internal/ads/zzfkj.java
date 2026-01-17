package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzbx;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzch;
import com.google.android.gms.ads.internal.client.zzcj;
import com.google.android.gms.ads.internal.client.zzfv;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfkj extends zzcj {
    private final zzfkp zza;
    private final zzfkc zzb;

    zzfkj(zzfkp zzfkp, zzfkc zzfkc) {
        this.zza = zzfkp;
        this.zzb = zzfkc;
    }

    public final int zze(int i, String str) {
        AdFormat adFormat = AdFormat.getAdFormat(i);
        if (adFormat == null) {
            return 0;
        }
        return this.zzb.zza(adFormat, str);
    }

    public final Bundle zzf(int i) {
        Map zzf = this.zzb.zzf(i);
        Bundle bundle = new Bundle();
        for (Map.Entry entry : zzf.entrySet()) {
            bundle.putByteArray((String) entry.getKey(), SafeParcelableSerializer.serializeToBytes((zzfv) entry.getValue()));
        }
        return bundle;
    }

    public final zzbaw zzg(String str) {
        return this.zzb.zzb(str);
    }

    public final zzbaw zzh(String str) {
        return this.zza.zza(str);
    }

    public final zzbx zzi(String str) {
        return this.zzb.zzc(str);
    }

    public final zzbx zzj(String str) {
        return this.zza.zzb(str);
    }

    public final zzfv zzk(int i, String str) {
        AdFormat adFormat = AdFormat.getAdFormat(i);
        if (adFormat == null) {
            return null;
        }
        return this.zzb.zzd(adFormat, str);
    }

    public final zzbwv zzl(String str) {
        return this.zzb.zze(str);
    }

    public final zzbwv zzm(String str) {
        return this.zza.zzc(str);
    }

    public final void zzn(int i) {
        this.zzb.zzg(i);
    }

    public final void zzo(zzbpq zzbpq) {
        zzfkp zzfkp = this.zza;
        zzfkp.zzg(zzbpq);
        zzfkp.zzi();
    }

    public final void zzp(List list, zzce zzce) {
        this.zza.zzh(list, zzce);
    }

    public final boolean zzq(int i, String str) {
        AdFormat adFormat = AdFormat.getAdFormat(i);
        if (adFormat == null) {
            return false;
        }
        return this.zzb.zzh(adFormat, str);
    }

    public final boolean zzr(int i, String str) {
        AdFormat adFormat = AdFormat.getAdFormat(i);
        if (adFormat == null) {
            return false;
        }
        return this.zzb.zzi(adFormat, str);
    }

    public final boolean zzs(String str) {
        return this.zza.zzj(str);
    }

    public final boolean zzt(String str) {
        return this.zza.zzk(str);
    }

    public final boolean zzu(String str) {
        return this.zza.zzl(str);
    }

    public final boolean zzv(String str, zzfv zzfv, zzch zzch) {
        return this.zzb.zzj(str, zzfv, zzch);
    }
}
