package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzflm {
    private final zzflx zza;
    private final zzflx zzb;
    private final boolean zzc;
    private final zzflq zzd;
    private final zzflt zze;

    private zzflm(zzflq zzflq, zzflt zzflt, zzflx zzflx, zzflx zzflx2, boolean z) {
        this.zzd = zzflq;
        this.zze = zzflt;
        this.zza = zzflx;
        if (zzflx2 == null) {
            this.zzb = zzflx.NONE;
        } else {
            this.zzb = zzflx2;
        }
        this.zzc = z;
    }

    public static zzflm zza(zzflq zzflq, zzflt zzflt, zzflx zzflx, zzflx zzflx2, boolean z) {
        zzfni.zzc(zzflq, "CreativeType is null");
        zzfni.zzc(zzflt, "ImpressionType is null");
        zzfni.zzc(zzflx, "Impression owner is null");
        if (zzflx == zzflx.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        } else if (zzflq == zzflq.DEFINED_BY_JAVASCRIPT && zzflx == zzflx.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        } else if (zzflt != zzflt.DEFINED_BY_JAVASCRIPT || zzflx != zzflx.NATIVE) {
            return new zzflm(zzflq, zzflt, zzflx, zzflx2, z);
        } else {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }

    public final JSONObject zzb() {
        JSONObject jSONObject = new JSONObject();
        zzfne.zze(jSONObject, "impressionOwner", this.zza);
        zzfne.zze(jSONObject, "mediaEventsOwner", this.zzb);
        zzfne.zze(jSONObject, "creativeType", this.zzd);
        zzfne.zze(jSONObject, "impressionType", this.zze);
        zzfne.zze(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.zzc));
        return jSONObject;
    }
}
