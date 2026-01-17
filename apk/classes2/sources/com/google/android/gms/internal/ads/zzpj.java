package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzpj {
    public static final zzpj zza = new zzpj(zzfyq.zzo(zzpi.zza));
    static final zzfyt zzb;
    private static final zzfyq zzc = zzfyq.zzq(2, 5, 6);
    private final SparseArray zzd = new SparseArray();
    private final int zze;

    static {
        zzfys zzfys = new zzfys();
        zzfys.zza(5, 6);
        zzfys.zza(17, 6);
        zzfys.zza(7, 6);
        zzfys.zza(30, 10);
        zzfys.zza(18, 6);
        zzfys.zza(6, 8);
        zzfys.zza(8, 8);
        zzfys.zza(14, 8);
        zzb = zzfys.zzc();
    }

    private zzpj(List list) {
        for (int i = 0; i < list.size(); i++) {
            zzpi zzpi = (zzpi) list.get(i);
            this.zzd.put(zzpi.zzb, zzpi);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzd.size(); i3++) {
            i2 = Math.max(i2, ((zzpi) this.zzd.valueAt(i3)).zzc);
        }
        this.zze = i2;
    }

    static Uri zza() {
        if (zzf()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    static zzpj zzc(Context context, zze zze2, zzpp zzpp) {
        return zzd(context, context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), zze2, zzpp);
    }

    static zzpj zzd(Context context, Intent intent, zze zze2, zzpp zzpp) {
        AudioDeviceInfo[] audioDeviceInfoArr;
        AudioManager zzc2 = zzcj.zzc(context);
        if (zzpp == null) {
            zzpp zzpp2 = null;
            if (Build.VERSION.SDK_INT >= 33) {
                AudioManager audioManager = zzc2;
                List audioDevicesForAttributes = zzc2.getAudioDevicesForAttributes(zze2.zza().zza);
                if (!audioDevicesForAttributes.isEmpty()) {
                    zzpp2 = new zzpp((AudioDeviceInfo) audioDevicesForAttributes.get(0));
                }
            }
            zzpp = zzpp2;
        }
        if (Build.VERSION.SDK_INT < 33 || (!zzex.zzN(context) && !zzex.zzJ(context))) {
            if (zzpp == null) {
                AudioManager audioManager2 = zzc2;
                audioDeviceInfoArr = zzc2.getDevices(2);
            } else {
                audioDeviceInfoArr = new AudioDeviceInfo[]{zzpp.zza};
            }
            zzfyu zzfyu = new zzfyu();
            zzfyu.zzg(8, 7);
            if (Build.VERSION.SDK_INT >= 31) {
                zzfyu.zzg(26, 27);
            }
            if (Build.VERSION.SDK_INT >= 33) {
                zzfyu.zzf(30);
            }
            zzfyv zzi = zzfyu.zzi();
            for (AudioDeviceInfo type : audioDeviceInfoArr) {
                if (zzi.contains(Integer.valueOf(type.getType()))) {
                    return zza;
                }
            }
            zzfyu zzfyu2 = new zzfyu();
            zzfyu2.zzf(2);
            if (Build.VERSION.SDK_INT < 29 || (!zzex.zzN(context) && !zzex.zzJ(context))) {
                ContentResolver contentResolver = context.getContentResolver();
                boolean z = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
                if ((z || zzf()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
                    zzfyu2.zzh(zzc);
                }
                if (intent == null || z || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
                    return new zzpj(zze(zzgbt.zzi(zzfyu2.zzi()), 10));
                }
                int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
                if (intArrayExtra != null) {
                    zzfyu2.zzh(zzgbt.zzh(intArrayExtra));
                }
                return new zzpj(zze(zzgbt.zzi(zzfyu2.zzi()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
            }
            int i = zzfyq.zzd;
            zzfyn zzfyn = new zzfyn();
            zzgaw zze3 = zzb.keySet().iterator();
            while (zze3.hasNext()) {
                int intValue = ((Integer) zze3.next()).intValue();
                if (Build.VERSION.SDK_INT >= zzex.zzh(intValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), zze2.zza().zza)) {
                    zzfyn.zzf(Integer.valueOf(intValue));
                }
            }
            zzfyn.zzf(2);
            zzfyu2.zzh(zzfyn.zzi());
            return new zzpj(zze(zzgbt.zzi(zzfyu2.zzi()), 10));
        }
        List directProfilesForAttributes = zzc2.getDirectProfilesForAttributes(zze2.zza().zza);
        HashMap hashMap = new HashMap();
        hashMap.put(2, new HashSet(zzgbt.zzh(12)));
        for (int i2 = 0; i2 < directProfilesForAttributes.size(); i2++) {
            AudioProfile audioProfile = (AudioProfile) directProfilesForAttributes.get(i2);
            if (audioProfile.getEncapsulationType() != 1) {
                int format = audioProfile.getFormat();
                if (zzex.zzK(format) || zzb.containsKey(Integer.valueOf(format))) {
                    Integer valueOf = Integer.valueOf(format);
                    if (hashMap.containsKey(valueOf)) {
                        Set set = (Set) hashMap.get(valueOf);
                        set.getClass();
                        Set set2 = set;
                        set.addAll(zzgbt.zzh(audioProfile.getChannelMasks()));
                    } else {
                        hashMap.put(valueOf, new HashSet(zzgbt.zzh(audioProfile.getChannelMasks())));
                    }
                }
            }
        }
        int i3 = zzfyq.zzd;
        zzfyn zzfyn2 = new zzfyn();
        for (Map.Entry entry : hashMap.entrySet()) {
            zzfyn2.zzf(new zzpi(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return new zzpj(zzfyn2.zzi());
    }

    private static zzfyq zze(int[] iArr, int i) {
        int i2 = zzfyq.zzd;
        zzfyn zzfyn = new zzfyn();
        for (int zzpi : iArr) {
            zzfyn.zzf(new zzpi(zzpi, i));
        }
        return zzfyn.zzi();
    }

    private static boolean zzf() {
        return Build.MANUFACTURER.equals("Amazon") || Build.MANUFACTURER.equals("Xiaomi");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r1.contentEquals(r3) != false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r9 instanceof com.google.android.gms.internal.ads.zzpj
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            com.google.android.gms.internal.ads.zzpj r9 = (com.google.android.gms.internal.ads.zzpj) r9
            android.util.SparseArray r1 = r8.zzd
            android.util.SparseArray r3 = r9.zzd
            java.lang.String r4 = com.google.android.gms.internal.ads.zzex.zza
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 31
            if (r4 < r5) goto L_0x001f
            boolean r1 = r1.contentEquals(r3)
            if (r1 == 0) goto L_0x0048
            goto L_0x0041
        L_0x001f:
            int r4 = r1.size()
            int r5 = r3.size()
            if (r4 != r5) goto L_0x0048
            r5 = r2
        L_0x002a:
            if (r5 >= r4) goto L_0x0041
            int r6 = r1.keyAt(r5)
            java.lang.Object r7 = r1.valueAt(r5)
            java.lang.Object r6 = r3.get(r6)
            boolean r6 = java.util.Objects.equals(r7, r6)
            if (r6 == 0) goto L_0x0048
            int r5 = r5 + 1
            goto L_0x002a
        L_0x0041:
            int r1 = r8.zze
            int r9 = r9.zze
            if (r1 != r9) goto L_0x0048
            return r0
        L_0x0048:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpj.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        String str = zzex.zza;
        int i2 = Build.VERSION.SDK_INT;
        SparseArray sparseArray = this.zzd;
        if (i2 >= 31) {
            i = sparseArray.contentHashCode();
        } else {
            int i3 = 17;
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                i3 = (((i3 * 31) + sparseArray.keyAt(i4)) * 31) + Objects.hashCode(sparseArray.valueAt(i4));
            }
            i = i3;
        }
        return this.zze + (i * 31);
    }

    public final String toString() {
        String obj = this.zzd.toString();
        return "AudioCapabilities[maxChannelCount=" + this.zze + ", audioProfiles=" + obj + "]";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        if (com.google.android.gms.internal.ads.zzex.zzH(r9.zzd, 30) == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009c, code lost:
        if (r7 != 5) goto L_0x009f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair zzb(com.google.android.gms.internal.ads.zzz r10, com.google.android.gms.internal.ads.zze r11) {
        /*
            r9 = this;
            java.lang.String r0 = r10.zzo
            r0.getClass()
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r10.zzk
            int r1 = com.google.android.gms.internal.ads.zzay.zza(r0, r1)
            com.google.android.gms.internal.ads.zzfyt r2 = zzb
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            boolean r2 = r2.containsKey(r3)
            if (r2 != 0) goto L_0x001c
            goto L_0x00c7
        L_0x001c:
            r2 = 7
            r3 = 6
            r4 = 8
            r5 = 18
            if (r1 != r5) goto L_0x002f
            android.util.SparseArray r1 = r9.zzd
            boolean r1 = com.google.android.gms.internal.ads.zzex.zzH(r1, r5)
            if (r1 != 0) goto L_0x002e
            r1 = r3
            goto L_0x004a
        L_0x002e:
            r1 = r5
        L_0x002f:
            if (r1 != r4) goto L_0x003d
            android.util.SparseArray r1 = r9.zzd
            boolean r1 = com.google.android.gms.internal.ads.zzex.zzH(r1, r4)
            if (r1 == 0) goto L_0x003b
            r1 = r4
            goto L_0x003d
        L_0x003b:
            r1 = r2
            goto L_0x004a
        L_0x003d:
            r6 = 30
            if (r1 != r6) goto L_0x004a
            android.util.SparseArray r7 = r9.zzd
            boolean r6 = com.google.android.gms.internal.ads.zzex.zzH(r7, r6)
            if (r6 != 0) goto L_0x004a
            goto L_0x003b
        L_0x004a:
            android.util.SparseArray r6 = r9.zzd
            boolean r7 = com.google.android.gms.internal.ads.zzex.zzH(r6, r1)
            if (r7 == 0) goto L_0x00c7
            java.lang.Object r6 = r6.get(r1)
            com.google.android.gms.internal.ads.zzpi r6 = (com.google.android.gms.internal.ads.zzpi) r6
            r6.getClass()
            r7 = r6
            com.google.android.gms.internal.ads.zzpi r7 = (com.google.android.gms.internal.ads.zzpi) r7
            int r7 = r10.zzG
            r8 = -1
            if (r7 == r8) goto L_0x0080
            if (r1 != r5) goto L_0x0066
            goto L_0x0080
        L_0x0066:
            java.lang.String r10 = "audio/vnd.dts.uhd;profile=p2"
            boolean r10 = r0.equals(r10)
            if (r10 == 0) goto L_0x0079
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 33
            if (r10 >= r11) goto L_0x0079
            r10 = 10
            if (r7 <= r10) goto L_0x008b
            goto L_0x00c7
        L_0x0079:
            boolean r10 = r6.zzb(r7)
            if (r10 != 0) goto L_0x008b
            goto L_0x00c7
        L_0x0080:
            int r10 = r10.zzH
            if (r10 != r8) goto L_0x0087
            r10 = 48000(0xbb80, float:6.7262E-41)
        L_0x0087:
            int r7 = r6.zza(r10, r11)
        L_0x008b:
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 28
            if (r10 > r11) goto L_0x009f
            if (r7 != r2) goto L_0x0095
            r3 = r4
            goto L_0x00a0
        L_0x0095:
            r10 = 3
            if (r7 == r10) goto L_0x00a0
            r10 = 4
            if (r7 == r10) goto L_0x00a0
            r10 = 5
            if (r7 != r10) goto L_0x009f
            goto L_0x00a0
        L_0x009f:
            r3 = r7
        L_0x00a0:
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 26
            if (r10 > r11) goto L_0x00b4
            java.lang.String r10 = "fugu"
            java.lang.String r11 = android.os.Build.DEVICE
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x00b4
            r10 = 1
            if (r3 != r10) goto L_0x00b4
            r3 = 2
        L_0x00b4:
            int r10 = com.google.android.gms.internal.ads.zzex.zzi(r3)
            if (r10 == 0) goto L_0x00c7
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            android.util.Pair r10 = android.util.Pair.create(r11, r10)
            return r10
        L_0x00c7:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpj.zzb(com.google.android.gms.internal.ads.zzz, com.google.android.gms.internal.ads.zze):android.util.Pair");
    }
}
