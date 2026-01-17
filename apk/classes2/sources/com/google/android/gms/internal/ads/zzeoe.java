package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeoe implements zzeuc {
    private final zzgdy zza;
    private final Context zzb;

    public zzeoe(zzgdy zzgdy, Context context) {
        this.zza = zzgdy;
        this.zzb = context;
    }

    public static /* synthetic */ zzeof zzc(zzeoe zzeoe) {
        int i;
        int i2;
        AudioManager audioManager = (AudioManager) zzeoe.zzb.getSystemService("audio");
        float zza2 = zzv.zzt().zza();
        boolean zze = zzv.zzt().zze();
        if (audioManager == null) {
            return new zzeof(-1, false, false, -1, -1, -1, -1, -1, zza2, zze, true);
        }
        int mode = audioManager.getMode();
        boolean isMusicActive = audioManager.isMusicActive();
        boolean isSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int streamVolume = audioManager.getStreamVolume(3);
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzlu)).booleanValue()) {
            int zzj = zzv.zzs().zzj(audioManager);
            i = audioManager.getStreamMaxVolume(3);
            i2 = zzj;
        } else {
            i2 = -1;
            i = -1;
        }
        return new zzeof(mode, isMusicActive, isSpeakerphoneOn, streamVolume, i2, i, audioManager.getRingerMode(), audioManager.getStreamVolume(2), zza2, zze, false);
    }

    public final int zza() {
        return 13;
    }

    public final ListenableFuture zzb() {
        return this.zza.zzb(new zzeod(this));
    }
}
