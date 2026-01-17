package com.google.android.gms.internal.ads;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzch {
    private final int zza = 1;
    private final AudioManager.OnAudioFocusChangeListener zzb;
    private final Handler zzc;
    private final zze zzd;
    private final boolean zze;
    private final Object zzf;

    zzch(int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, zze zze2, boolean z) {
        this.zzc = handler;
        this.zzd = zze2;
        this.zze = false;
        this.zzb = onAudioFocusChangeListener;
        this.zzf = new AudioFocusRequest.Builder(1).setAudioAttributes(zze2.zza().zza).setWillPauseWhenDucked(false).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzch)) {
            return false;
        }
        zzch zzch = (zzch) obj;
        int i = zzch.zza;
        boolean z = zzch.zze;
        return Objects.equals(this.zzb, zzch.zzb) && Objects.equals(this.zzc, zzch.zzc) && Objects.equals(this.zzd, zzch.zzd);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{1, this.zzb, this.zzc, this.zzd, false});
    }

    public final AudioManager.OnAudioFocusChangeListener zzb() {
        return this.zzb;
    }

    public final zze zzc() {
        return this.zzd;
    }

    /* access modifiers changed from: package-private */
    public final AudioFocusRequest zza() {
        Object obj = this.zzf;
        obj.getClass();
        return (AudioFocusRequest) obj;
    }
}
