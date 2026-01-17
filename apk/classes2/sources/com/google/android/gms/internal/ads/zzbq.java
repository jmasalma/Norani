package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.HashSet;
import kotlin.jvm.internal.IntCompanionObject;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public class zzbq {
    /* access modifiers changed from: private */
    public int zza;
    /* access modifiers changed from: private */
    public int zzb;
    /* access modifiers changed from: private */
    public int zzc;
    /* access modifiers changed from: private */
    public int zzd;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public int zzf;
    /* access modifiers changed from: private */
    public boolean zzg;
    /* access modifiers changed from: private */
    public boolean zzh;
    /* access modifiers changed from: private */
    public zzfyq zzi;
    /* access modifiers changed from: private */
    public zzfyq zzj;
    /* access modifiers changed from: private */
    public zzfyq zzk;
    /* access modifiers changed from: private */
    public int zzl;
    /* access modifiers changed from: private */
    public int zzm;
    /* access modifiers changed from: private */
    public zzfyq zzn;
    /* access modifiers changed from: private */
    public zzbp zzo;
    /* access modifiers changed from: private */
    public zzfyq zzp;
    /* access modifiers changed from: private */
    public boolean zzq;
    /* access modifiers changed from: private */
    public HashMap zzr;
    /* access modifiers changed from: private */
    public HashSet zzs;

    public zzbq() {
        this.zza = IntCompanionObject.MAX_VALUE;
        this.zzb = IntCompanionObject.MAX_VALUE;
        this.zzc = IntCompanionObject.MAX_VALUE;
        this.zzd = IntCompanionObject.MAX_VALUE;
        this.zze = IntCompanionObject.MAX_VALUE;
        this.zzf = IntCompanionObject.MAX_VALUE;
        this.zzg = true;
        this.zzh = true;
        this.zzi = zzfyq.zzn();
        this.zzj = zzfyq.zzn();
        this.zzk = zzfyq.zzn();
        this.zzl = IntCompanionObject.MAX_VALUE;
        this.zzm = IntCompanionObject.MAX_VALUE;
        this.zzn = zzfyq.zzn();
        this.zzo = zzbp.zza;
        this.zzp = zzfyq.zzn();
        this.zzq = true;
        this.zzr = new HashMap();
        this.zzs = new HashSet();
    }

    @EnsuresNonNull({"preferredVideoMimeTypes", "preferredVideoLanguages", "preferredAudioLanguages", "preferredAudioMimeTypes", "audioOffloadPreferences", "preferredTextLanguages", "overrides", "disabledTrackTypes"})
    private final void zzu(zzbr zzbr) {
        this.zza = zzbr.zza;
        this.zzb = zzbr.zzb;
        this.zzc = zzbr.zzc;
        this.zzd = zzbr.zzd;
        int i = zzbr.zze;
        int i2 = zzbr.zzf;
        int i3 = zzbr.zzg;
        int i4 = zzbr.zzh;
        this.zze = zzbr.zzi;
        this.zzf = zzbr.zzj;
        this.zzg = zzbr.zzk;
        this.zzh = zzbr.zzl;
        this.zzi = zzbr.zzm;
        this.zzj = zzbr.zzn;
        int i5 = zzbr.zzo;
        this.zzk = zzbr.zzp;
        int i6 = zzbr.zzq;
        this.zzl = zzbr.zzr;
        this.zzm = zzbr.zzs;
        this.zzn = zzbr.zzt;
        this.zzo = zzbr.zzu;
        this.zzp = zzbr.zzv;
        int i7 = zzbr.zzw;
        this.zzq = zzbr.zzx;
        int i8 = zzbr.zzy;
        boolean z = zzbr.zzz;
        boolean z2 = zzbr.zzA;
        boolean z3 = zzbr.zzB;
        boolean z4 = zzbr.zzC;
        this.zzs = new HashSet(zzbr.zzE);
        this.zzr = new HashMap(zzbr.zzD);
    }

    /* access modifiers changed from: protected */
    public final zzbq zzj(zzbr zzbr) {
        zzu(zzbr);
        return this;
    }

    protected zzbq(zzbr zzbr) {
        zzu(zzbr);
    }
}
