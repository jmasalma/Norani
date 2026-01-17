package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzgyt extends zzgys {
    zzgyt() {
    }

    /* access modifiers changed from: package-private */
    public final void zza(Object obj) {
        ((zzgzd) obj).zza.zzg();
    }

    /* access modifiers changed from: package-private */
    public final void zzb(zzhcm zzhcm, Map.Entry entry) throws IOException {
        zzgze zzgze = (zzgze) entry.getKey();
        if (zzgze.zzc) {
            zzhck zzhck = zzhck.DOUBLE;
            switch (zzgze.zzb.ordinal()) {
                case 0:
                    zzhbn.zzt(zzgze.zza, (List) entry.getValue(), zzhcm, zzgze.zzd);
                    return;
                case 1:
                    zzhbn.zzx(zzgze.zza, (List) entry.getValue(), zzhcm, zzgze.zzd);
                    return;
                case 2:
                    zzhbn.zzA(zzgze.zza, (List) entry.getValue(), zzhcm, zzgze.zzd);
                    return;
                case 3:
                    zzhbn.zzI(zzgze.zza, (List) entry.getValue(), zzhcm, zzgze.zzd);
                    return;
                case 4:
                    zzhbn.zzz(zzgze.zza, (List) entry.getValue(), zzhcm, zzgze.zzd);
                    return;
                case 5:
                    zzhbn.zzw(zzgze.zza, (List) entry.getValue(), zzhcm, zzgze.zzd);
                    return;
                case 6:
                    zzhbn.zzv(zzgze.zza, (List) entry.getValue(), zzhcm, zzgze.zzd);
                    return;
                case 7:
                    zzhbn.zzr(zzgze.zza, (List) entry.getValue(), zzhcm, zzgze.zzd);
                    return;
                case 8:
                    zzhbn.zzG(zzgze.zza, (List) entry.getValue(), zzhcm);
                    return;
                case 9:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        zzhbn.zzy(zzgze.zza, (List) entry.getValue(), zzhcm, zzhbc.zza().zzb(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 10:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        zzhbn.zzB(zzgze.zza, (List) entry.getValue(), zzhcm, zzhbc.zza().zzb(list2.get(0).getClass()));
                        return;
                    }
                    return;
                case 11:
                    zzhbn.zzs(zzgze.zza, (List) entry.getValue(), zzhcm);
                    return;
                case 12:
                    zzhbn.zzH(zzgze.zza, (List) entry.getValue(), zzhcm, zzgze.zzd);
                    return;
                case 13:
                    zzhbn.zzz(zzgze.zza, (List) entry.getValue(), zzhcm, zzgze.zzd);
                    return;
                case 14:
                    zzhbn.zzC(zzgze.zza, (List) entry.getValue(), zzhcm, zzgze.zzd);
                    return;
                case 15:
                    zzhbn.zzD(zzgze.zza, (List) entry.getValue(), zzhcm, zzgze.zzd);
                    return;
                case 16:
                    zzhbn.zzE(zzgze.zza, (List) entry.getValue(), zzhcm, zzgze.zzd);
                    return;
                case 17:
                    zzhbn.zzF(zzgze.zza, (List) entry.getValue(), zzhcm, zzgze.zzd);
                    return;
                default:
                    return;
            }
        } else {
            zzhck zzhck2 = zzhck.DOUBLE;
            switch (zzgze.zzb.ordinal()) {
                case 0:
                    zzhcm.zzf(zzgze.zza, ((Double) entry.getValue()).doubleValue());
                    return;
                case 1:
                    zzhcm.zzo(zzgze.zza, ((Float) entry.getValue()).floatValue());
                    return;
                case 2:
                    zzhcm.zzt(zzgze.zza, ((Long) entry.getValue()).longValue());
                    return;
                case 3:
                    zzhcm.zzK(zzgze.zza, ((Long) entry.getValue()).longValue());
                    return;
                case 4:
                    zzhcm.zzr(zzgze.zza, ((Integer) entry.getValue()).intValue());
                    return;
                case 5:
                    zzhcm.zzm(zzgze.zza, ((Long) entry.getValue()).longValue());
                    return;
                case 6:
                    zzhcm.zzk(zzgze.zza, ((Integer) entry.getValue()).intValue());
                    return;
                case 7:
                    zzhcm.zzb(zzgze.zza, ((Boolean) entry.getValue()).booleanValue());
                    return;
                case 8:
                    zzhcm.zzG(zzgze.zza, (String) entry.getValue());
                    return;
                case 9:
                    zzhcm.zzq(zzgze.zza, entry.getValue(), zzhbc.zza().zzb(entry.getValue().getClass()));
                    return;
                case 10:
                    zzhcm.zzv(zzgze.zza, entry.getValue(), zzhbc.zza().zzb(entry.getValue().getClass()));
                    return;
                case 11:
                    zzhcm.zzd(zzgze.zza, (zzgxz) entry.getValue());
                    return;
                case 12:
                    zzhcm.zzI(zzgze.zza, ((Integer) entry.getValue()).intValue());
                    return;
                case 13:
                    zzhcm.zzr(zzgze.zza, ((Integer) entry.getValue()).intValue());
                    return;
                case 14:
                    zzhcm.zzx(zzgze.zza, ((Integer) entry.getValue()).intValue());
                    return;
                case 15:
                    zzhcm.zzz(zzgze.zza, ((Long) entry.getValue()).longValue());
                    return;
                case 16:
                    zzhcm.zzB(zzgze.zza, ((Integer) entry.getValue()).intValue());
                    return;
                case 17:
                    zzhcm.zzD(zzgze.zza, ((Long) entry.getValue()).longValue());
                    return;
                default:
                    return;
            }
        }
    }
}
