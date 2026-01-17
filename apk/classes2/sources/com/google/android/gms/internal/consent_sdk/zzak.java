package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
final class zzak implements zzax {
    final zzdr zza;
    final zzdr zzb;
    final zzdr zzc;
    final zzdr zzd;
    final zzdr zze;
    private final zzah zzf;

    zzak(zzah zzah, zzbq zzbq) {
        zzah zzah2 = zzah;
        this.zzf = zzah2;
        zzdr zzb2 = zzdn.zzb(new zzby(zzah2.zza));
        this.zza = zzb2;
        zzdo zzb3 = zzdp.zzb(zzbq);
        this.zzb = zzb3;
        zzdm zzdm = new zzdm();
        this.zzc = zzdm;
        zzdr zzdr = zzah2.zza;
        zzat zzat = zzas.zza;
        zzav zzav = zzau.zza;
        zzdr zzdr2 = zzah2.zzg;
        zzdr zzdr3 = zzah2.zzj;
        zzdr zzdr4 = zzah2.zzb;
        zzdr zzdr5 = zzdr;
        zzdo zzdo = zzb3;
        zzcc zzcc = r4;
        zzcc zzcc2 = new zzcc(zzdr5, zzb2, zzat, zzav, zzdr2, zzdr3, zzdm, zzdr4);
        this.zzd = zzcc;
        zzbw zzbw = new zzbw(zzb2, zzat, zzcc);
        this.zze = zzbw;
        zzdm.zzb(zzdm, zzdn.zzb(new zzbd(zzdr5, zzah2.zzc, zzb2, zzdr4, zzdo, zzbw)));
    }

    public final zzbc zza() {
        return (zzbc) this.zzc.zza();
    }
}
