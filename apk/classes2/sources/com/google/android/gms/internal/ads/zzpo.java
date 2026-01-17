package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzpo {
    /* access modifiers changed from: private */
    public final Context zza;
    private final Handler zzb;
    private final zzpk zzc = new zzpk(this, (zzpn) null);
    private final BroadcastReceiver zzd = new zzpm(this, (zzpn) null);
    private final zzpl zze;
    private zzpj zzf;
    /* access modifiers changed from: private */
    public zzpp zzg;
    /* access modifiers changed from: private */
    public zze zzh;
    private boolean zzi;
    private final zzqy zzj;

    zzpo(Context context, zzqy zzqy, zze zze2, zzpp zzpp) {
        Context applicationContext = context.getApplicationContext();
        this.zza = applicationContext;
        zzqy zzqy2 = zzqy;
        this.zzj = zzqy;
        this.zzh = zze2;
        this.zzg = zzpp;
        zzpl zzpl = null;
        Handler handler = new Handler(zzex.zzz(), (Handler.Callback) null);
        this.zzb = handler;
        Uri zza2 = zzpj.zza();
        this.zze = zza2 != null ? new zzpl(this, handler, applicationContext.getContentResolver(), zza2) : zzpl;
    }

    /* access modifiers changed from: private */
    public final void zzk(zzpj zzpj) {
        if (this.zzi && !zzpj.equals(this.zzf)) {
            this.zzf = zzpj;
            this.zzj.zza.zzK(zzpj);
        }
    }

    public final void zzg(zzpj zzpj) {
        zzk(zzpj);
    }

    public final void zzh(zze zze2) {
        this.zzh = zze2;
        zzk(zzpj.zzc(this.zza, zze2, this.zzg));
    }

    public final void zzi(AudioDeviceInfo audioDeviceInfo) {
        AudioDeviceInfo audioDeviceInfo2;
        zzpp zzpp = this.zzg;
        zzpp zzpp2 = null;
        if (zzpp == null) {
            audioDeviceInfo2 = null;
        } else {
            audioDeviceInfo2 = zzpp.zza;
        }
        if (!Objects.equals(audioDeviceInfo, audioDeviceInfo2)) {
            if (audioDeviceInfo != null) {
                zzpp2 = new zzpp(audioDeviceInfo);
            }
            this.zzg = zzpp2;
            zzk(zzpj.zzc(this.zza, this.zzh, zzpp2));
        }
    }

    public final void zzj() {
        if (this.zzi) {
            this.zzf = null;
            zzpk zzpk = this.zzc;
            if (zzpk != null) {
                zzcj.zzc(this.zza).unregisterAudioDeviceCallback(zzpk);
            }
            this.zza.unregisterReceiver(this.zzd);
            zzpl zzpl = this.zze;
            if (zzpl != null) {
                zzpl.zzb();
            }
            this.zzi = false;
        }
    }

    public final zzpj zzc() {
        if (this.zzi) {
            zzpj zzpj = this.zzf;
            zzpj.getClass();
            zzpj zzpj2 = zzpj;
            return zzpj;
        }
        this.zzi = true;
        zzpl zzpl = this.zze;
        if (zzpl != null) {
            zzpl.zza();
        }
        zzpk zzpk = this.zzc;
        if (zzpk != null) {
            Context context = this.zza;
            zzcj.zzc(context).registerAudioDeviceCallback(zzpk, this.zzb);
        }
        Context context2 = this.zza;
        zzpj zzd2 = zzpj.zzd(context2, context2.registerReceiver(this.zzd, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), (String) null, this.zzb), this.zzh, this.zzg);
        this.zzf = zzd2;
        return zzd2;
    }
}
