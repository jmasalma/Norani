package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzym {
    private final Spatializer zza;
    private final boolean zzb;
    private final Handler zzc;
    private final Spatializer.OnSpatializerStateChangedListener zzd;

    public final void zza() {
        Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener;
        Handler handler;
        Spatializer spatializer = this.zza;
        if (spatializer != null && (onSpatializerStateChangedListener = this.zzd) != null && (handler = this.zzc) != null) {
            spatializer.removeOnSpatializerStateChangedListener(onSpatializerStateChangedListener);
            handler.removeCallbacksAndMessages((Object) null);
        }
    }

    public final boolean zzb(zze zze, zzz zzz) {
        int i;
        String str = zzz.zzo;
        if (Objects.equals(str, "audio/eac3-joc")) {
            i = zzz.zzG;
            if (i == 16) {
                i = 12;
            }
        } else if (Objects.equals(str, "audio/iamf")) {
            i = zzz.zzG;
            if (i == -1) {
                i = 6;
            }
        } else if (Objects.equals(str, "audio/ac4")) {
            i = zzz.zzG;
            if (i == 18 || i == 21) {
                i = 24;
            }
        } else {
            i = zzz.zzG;
        }
        int zzi = zzex.zzi(i);
        if (zzi == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(zzi);
        int i2 = zzz.zzH;
        if (i2 != -1) {
            channelMask.setSampleRate(i2);
        }
        Spatializer spatializer = this.zza;
        spatializer.getClass();
        Spatializer spatializer2 = spatializer;
        return spatializer.canBeSpatialized(zze.zza().zza, channelMask.build());
    }

    public final boolean zze() {
        return this.zzb;
    }

    public zzym(Context context, zzyu zzyu) {
        AudioManager audioManager;
        if (context == null) {
            audioManager = null;
        } else {
            audioManager = zzcj.zzc(context);
        }
        boolean z = false;
        if (audioManager != null) {
            Context context2 = context;
            if (!zzex.zzN(context)) {
                Spatializer spatializer = audioManager.getSpatializer();
                this.zza = spatializer;
                this.zzb = spatializer.getImmersiveAudioLevel() != 0 ? true : z;
                zzyl zzyl = new zzyl(this, zzyu);
                this.zzd = zzyl;
                Looper myLooper = Looper.myLooper();
                zzdd.zzb(myLooper);
                Looper looper = myLooper;
                Handler handler = new Handler(myLooper);
                this.zzc = handler;
                Objects.requireNonNull(handler);
                spatializer.addOnSpatializerStateChangedListener(new zzyk(handler), zzyl);
                return;
            }
        }
        this.zza = null;
        this.zzb = false;
        this.zzc = null;
        this.zzd = null;
    }

    public final boolean zzc() {
        Spatializer spatializer = this.zza;
        spatializer.getClass();
        Spatializer spatializer2 = spatializer;
        return spatializer.isAvailable();
    }

    public final boolean zzd() {
        Spatializer spatializer = this.zza;
        spatializer.getClass();
        Spatializer spatializer2 = spatializer;
        return spatializer.isEnabled();
    }
}
