package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.ext.SdkExtensions;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzv;
import javax.annotation.Nullable;
import kotlin.time.DurationKt;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeob implements zzeub {
    @Nullable
    private final Integer zza;

    private zzeob(@Nullable Integer num) {
        this.zza = num;
    }

    /* access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzeob zzc(VersionInfoParcel versionInfoParcel) {
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzkx)).booleanValue()) {
            return new zzeob((Integer) null);
        }
        zzv.zzr();
        int i = 0;
        try {
            if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
                if (((Boolean) zzbd.zzc().zzb(zzbde.zzkA)).booleanValue()) {
                    if (versionInfoParcel.clientJarVersion >= ((Integer) zzbd.zzc().zzb(zzbde.zzkz)).intValue() && Build.VERSION.SDK_INT >= 31 && SdkExtensions.getExtensionVersion(31) >= 9) {
                        i = SdkExtensions.getExtensionVersion(31);
                    }
                }
                return new zzeob(Integer.valueOf(i));
            }
            i = SdkExtensions.getExtensionVersion(DurationKt.NANOS_IN_MILLIS);
            return new zzeob(Integer.valueOf(i));
        } catch (Exception e) {
            zzv.zzp().zzw(e, "AdUtil.getAdServicesExtensionVersion");
        }
    }

    public final /* synthetic */ void zza(Object obj) {
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Integer num = this.zza;
        zzcva zzcva = (zzcva) obj;
        if (num != null) {
            zzcva.zza.putInt("aos", num.intValue());
        }
    }
}
