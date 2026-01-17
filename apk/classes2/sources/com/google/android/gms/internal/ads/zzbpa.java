package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbpa implements zzbom {
    /* access modifiers changed from: private */
    public final zzboo zza;
    private final zzbop zzb;
    private final zzboi zzc;
    private final String zzd;

    zzbpa(zzboi zzboi, String str, zzbop zzbop, zzboo zzboo) {
        this.zzc = zzboi;
        this.zzd = str;
        this.zzb = zzbop;
        this.zza = zzboo;
    }

    static /* bridge */ /* synthetic */ void zzd(zzbpa zzbpa, zzboc zzboc, zzboj zzboj, Object obj, zzcak zzcak) {
        try {
            zzv.zzr();
            String uuid = UUID.randomUUID().toString();
            zzbke.zzo.zzc(uuid, new zzboz(zzbpa, zzboc, zzcak));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", uuid);
            jSONObject.put("args", zzbpa.zzb.zzb(obj));
            zzboj.zzp(zzbpa.zzd, jSONObject);
        } catch (Exception e) {
            zzcak.zzd(e);
            int i = zze.zza;
            zzo.zzh("Unable to invokeJavascript", e);
            zzboc.zzb();
        } catch (Throwable th) {
            zzboc.zzb();
            throw th;
        }
    }

    public final ListenableFuture zza(Object obj) throws Exception {
        return zzb(obj);
    }

    public final ListenableFuture zzb(Object obj) {
        zzcak zzcak = new zzcak();
        zzboc zzb2 = this.zzc.zzb((zzavu) null);
        zze.zza("callJs > getEngine: Promise created");
        zzb2.zzj(new zzbox(this, zzb2, obj, zzcak), new zzboy(this, zzcak, zzb2));
        return zzcak;
    }
}
