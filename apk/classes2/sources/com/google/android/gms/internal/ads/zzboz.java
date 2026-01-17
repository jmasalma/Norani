package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzboz implements zzbku {
    final /* synthetic */ zzbpa zza;
    private final zzboc zzb;
    private final zzcak zzc;

    public zzboz(zzbpa zzbpa, zzboc zzboc, zzcak zzcak) {
        Objects.requireNonNull(zzbpa);
        this.zza = zzbpa;
        this.zzb = zzboc;
        this.zzc = zzcak;
    }

    public final void zza(String str) {
        if (str == null) {
            try {
                this.zzc.zzd(new zzbol());
            } catch (IllegalStateException unused) {
            } catch (Throwable th) {
                this.zzb.zzb();
                throw th;
            }
        } else {
            this.zzc.zzd(new zzbol(str));
        }
        this.zzb.zzb();
    }

    public final void zzb(JSONObject jSONObject) {
        try {
            this.zzc.zzc(this.zza.zza.zza(jSONObject));
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.zzc.zzd(e);
        } catch (Throwable th) {
            this.zzb.zzb();
            throw th;
        }
        this.zzb.zzb();
    }
}
