package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfme extends ContentObserver {
    /* access modifiers changed from: private */
    public final Handler zza;
    private final Context zzb;
    private final AudioManager zzc;
    /* access modifiers changed from: private */
    public final AtomicReference zzd = new AtomicReference(Float.valueOf(-1.0f));
    /* access modifiers changed from: private */
    public final AtomicBoolean zze = new AtomicBoolean(false);
    private final ExecutorService zzf = Executors.newSingleThreadExecutor();
    /* access modifiers changed from: private */
    public final zzfmq zzg;

    public zzfme(Handler handler, Context context, zzfma zzfma, zzfmq zzfmq) {
        super(handler);
        this.zza = handler;
        this.zzb = context;
        this.zzc = (AudioManager) context.getSystemService("audio");
        this.zzg = zzfmq;
    }

    static /* bridge */ /* synthetic */ float zza(zzfme zzfme) {
        AudioManager audioManager = zzfme.zzc;
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            return 0.0f;
        }
        float f = ((float) streamVolume) / ((float) streamMaxVolume);
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }

    private final void zzh() {
        this.zzf.submit(new zzfmd(this));
    }

    public final void onChange(boolean z) {
        if (!this.zze.getAndSet(true)) {
            zzh();
        }
    }

    public final void zze() {
        zzh();
        this.zzb.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void zzf() {
        this.zzb.getContentResolver().unregisterContentObserver(this);
    }
}
