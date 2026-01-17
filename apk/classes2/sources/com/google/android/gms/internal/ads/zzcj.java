package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcj {
    private static AudioManager zza;

    public static int zza(AudioManager audioManager, zzch zzch) {
        return audioManager.abandonAudioFocusRequest(zzch.zza());
    }

    public static int zzb(AudioManager audioManager, zzch zzch) {
        return audioManager.requestAudioFocus(zzch.zza());
    }

    public static synchronized AudioManager zzc(Context context) {
        synchronized (zzcj.class) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                zza = null;
            }
            AudioManager audioManager = zza;
            if (audioManager != null) {
                return audioManager;
            }
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                if (myLooper != Looper.getMainLooper()) {
                    zzdm zzdm = new zzdm(zzdj.zza);
                    zzde.zza().execute(new zzci(applicationContext, zzdm));
                    zzdm.zzb();
                    AudioManager audioManager2 = zza;
                    if (audioManager2 != null) {
                        AudioManager audioManager3 = audioManager2;
                        return audioManager2;
                    }
                    throw null;
                }
            }
            AudioManager audioManager4 = (AudioManager) applicationContext.getSystemService("audio");
            zza = audioManager4;
            if (audioManager4 != null) {
                AudioManager audioManager5 = audioManager4;
                return audioManager4;
            }
            throw null;
        }
    }

    static /* synthetic */ void zzd(Context context, zzdm zzdm) {
        zza = (AudioManager) context.getSystemService("audio");
        zzdm.zzf();
    }
}
