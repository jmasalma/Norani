package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzaym implements PackageManager.OnChecksumsReadyListener {
    public final /* synthetic */ zzgeh zza;

    public /* synthetic */ zzaym(zzgeh zzgeh) {
        this.zza = zzgeh;
    }

    public final void onChecksumsReady(List list) {
        zzgeh zzgeh = this.zza;
        if (list == null) {
            zzgeh.zzc((Object) null);
            return;
        }
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ApkChecksum apkChecksum = (ApkChecksum) list.get(i);
                if (apkChecksum.getType() == 8) {
                    zzgeh.zzc(zzaxa.zzb(apkChecksum.getValue()));
                    return;
                }
            }
            zzgeh.zzc((Object) null);
        } catch (Throwable unused) {
            zzgeh.zzc((Object) null);
        }
    }
}
