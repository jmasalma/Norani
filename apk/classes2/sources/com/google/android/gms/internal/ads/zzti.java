package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import java.util.Objects;
import kotlin.io.ConstantsKt;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzti {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    private final boolean zzi;
    private int zzj = -1;
    private int zzk = -1;
    private float zzl = -3.4028235E38f;

    public static zzti zzd(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        MediaCodecInfo.CodecCapabilities codecCapabilities2 = codecCapabilities;
        return new zzti(str, str2, str3, codecCapabilities, z, z2, z3, codecCapabilities2 != null && codecCapabilities2.isFeatureSupported("adaptive-playback"), codecCapabilities2 != null && codecCapabilities2.isFeatureSupported("tunneled-playback"), z5 || (codecCapabilities2 != null && codecCapabilities2.isFeatureSupported("secure-playback")), Build.VERSION.SDK_INT >= 35 && codecCapabilities2 != null && codecCapabilities2.isFeatureSupported("detached-surface") && !Build.MANUFACTURER.equals("Xiaomi") && !Build.MANUFACTURER.equals("OPPO") && !Build.MANUFACTURER.equals("realme"));
    }

    private static Point zzj(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        String str = zzex.zza;
        return new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    private final void zzk(String str) {
        String str2 = zzex.zza;
        zzea.zzb("MediaCodecInfo", "NoSupport [" + str + "] [" + this.zza + ", " + this.zzb + "] [" + str2 + "]");
    }

    private static boolean zzl(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point zzj2 = zzj(videoCapabilities, i, i2);
        int i3 = zzj2.x;
        int i4 = zzj2.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        double floor = Math.floor(d);
        if (!videoCapabilities.areSizeAndRateSupported(i3, i4, floor)) {
            return false;
        }
        Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i3, i4);
        if (achievableFrameRatesFor != null && floor > achievableFrameRatesFor.getUpper().doubleValue()) {
            return false;
        }
        return true;
    }

    private final boolean zzm(zzz zzz, boolean z) {
        int i = zzuc.zza;
        Pair zza2 = zzdk.zza(zzz);
        String str = zzz.zzo;
        char c = 65535;
        if (str != null && str.equals("video/mv-hevc")) {
            String zze2 = zzay.zze(this.zzc);
            if (!zze2.equals("video/mv-hevc")) {
                if (zze2.equals("video/hevc")) {
                    String zzh2 = zzfv.zzh(zzz.zzr);
                    if (zzh2 == null) {
                        zza2 = null;
                    } else {
                        String trim = zzh2.trim();
                        String str2 = zzex.zza;
                        zza2 = zzdk.zzb(zzh2, trim.split("\\.", -1), zzz.zzE);
                    }
                }
            }
            return true;
        }
        if (zza2 != null) {
            int intValue = ((Integer) zza2.first).intValue();
            int intValue2 = ((Integer) zza2.second).intValue();
            if ("video/dolby-vision".equals(str)) {
                String str3 = this.zzb;
                int hashCode = str3.hashCode();
                if (hashCode != -1662735862) {
                    if (hashCode != -1662541442) {
                        if (hashCode == 1331836730 && str3.equals("video/avc")) {
                            c = 0;
                        }
                    } else if (str3.equals("video/hevc")) {
                        c = 1;
                    }
                } else if (str3.equals("video/av01")) {
                    c = 2;
                }
                if (c == 0) {
                    intValue = 8;
                } else if (c == 1 || c == 2) {
                    intValue = 2;
                }
                intValue2 = 0;
            }
            if (!this.zzi) {
                if (intValue == 42) {
                    intValue = 42;
                }
            }
            MediaCodecInfo.CodecProfileLevel[] zzi2 = zzi();
            int length = zzi2.length;
            int i2 = 0;
            while (i2 < length) {
                MediaCodecInfo.CodecProfileLevel codecProfileLevel = zzi2[i2];
                if (codecProfileLevel.profile != intValue || ((codecProfileLevel.level < intValue2 && z) || ("video/hevc".equals(this.zzb) && intValue == 2 && ("sailfish".equals(Build.DEVICE) || "marlin".equals(Build.DEVICE))))) {
                    i2++;
                }
            }
            zzk("codec.profileLevel, " + zzz.zzk + ", " + this.zzc);
            return false;
        }
        return true;
    }

    private final boolean zzn(zzz zzz) {
        return !Objects.equals(zzz.zzo, "audio/flac") || zzz.zzI != 22 || Build.VERSION.SDK_INT >= 34 || !this.zza.equals("c2.android.flac.decoder");
    }

    private final boolean zzo(zzz zzz) {
        String str = this.zzb;
        return str.equals(zzz.zzo) || str.equals(zzuc.zzb(zzz));
    }

    public final String toString() {
        return this.zza;
    }

    public final float zza(int i, int i2) {
        if (!this.zzi) {
            return -3.4028235E38f;
        }
        float f = this.zzl;
        if (f != -3.4028235E38f && this.zzj == i && this.zzk == i2) {
            return f;
        }
        float f2 = 1024.0f;
        if (!zzh(i, i2, 1024.0d)) {
            float f3 = 0.0f;
            while (true) {
                float f4 = f2 - f3;
                if (Math.abs(f4) <= 5.0f) {
                    break;
                }
                float f5 = (f4 / 2.0f) + f3;
                boolean zzh2 = zzh(i, i2, (double) f5);
                if (true == zzh2) {
                    f3 = f5;
                }
                if (true != zzh2) {
                    f2 = f5;
                }
            }
            f2 = f3;
        }
        this.zzl = f2;
        this.zzj = i;
        this.zzk = i2;
        return f2;
    }

    public final Point zzb(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return zzj(videoCapabilities, i, i2);
    }

    public final zzie zzc(zzz zzz, zzz zzz2) {
        int i;
        boolean z = false;
        int i2 = true != Objects.equals(zzz.zzo, zzz2.zzo) ? 8 : 0;
        if (this.zzi) {
            if (zzz.zzA != zzz2.zzA) {
                i2 |= 1024;
            }
            if (!(zzz.zzv == zzz2.zzv && zzz.zzw == zzz2.zzw)) {
                z = true;
            }
            if (!this.zze && z) {
                i2 |= ConstantsKt.MINIMUM_BLOCK_SIZE;
            }
            zzk zzk2 = zzz.zzE;
            if ((!zzk.zzg(zzk2) || !zzk.zzg(zzz2.zzE)) && !Objects.equals(zzk2, zzz2.zzE)) {
                i2 |= 2048;
            }
            String str = this.zza;
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !zzz.zzd(zzz2)) {
                i2 |= 2;
            }
            int i3 = zzz.zzx;
            if (i3 != -1 && (i = zzz.zzy) != -1 && i3 == zzz2.zzx && i == zzz2.zzy && z) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new zzie(str, zzz, zzz2, true != zzz.zzd(zzz2) ? 2 : 3, 0);
            }
        } else {
            if (zzz.zzG != zzz2.zzG) {
                i2 |= ConstantsKt.DEFAULT_BLOCK_SIZE;
            }
            if (zzz.zzH != zzz2.zzH) {
                i2 |= ConstantsKt.DEFAULT_BUFFER_SIZE;
            }
            if (zzz.zzI != zzz2.zzI) {
                i2 |= 16384;
            }
            if (i2 == 0 && "audio/mp4a-latm".equals(this.zzb)) {
                int i4 = zzuc.zza;
                Pair zza2 = zzdk.zza(zzz);
                Pair zza3 = zzdk.zza(zzz2);
                if (!(zza2 == null || zza3 == null)) {
                    int intValue = ((Integer) zza2.first).intValue();
                    int intValue2 = ((Integer) zza3.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new zzie(this.zza, zzz, zzz2, 3, 0);
                    }
                }
            }
            if (!zzz.zzd(zzz2)) {
                i2 |= 32;
            }
            if ("audio/opus".equals(this.zzb)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new zzie(this.zza, zzz, zzz2, 1, 0);
            }
        }
        return new zzie(this.zza, zzz, zzz2, 0, i2);
    }

    public final boolean zze(zzz zzz) {
        if (!zzo(zzz) || !zzm(zzz, false) || !zzn(zzz)) {
            return false;
        }
        return true;
    }

    public final boolean zzf(zzz zzz) throws zztw {
        int i;
        int i2;
        if (!zzo(zzz) || !zzm(zzz, true) || !zzn(zzz)) {
            return false;
        }
        if (this.zzi) {
            int i3 = zzz.zzv;
            if (i3 <= 0 || (i2 = zzz.zzw) <= 0) {
                return true;
            }
            return zzh(i3, i2, (double) zzz.zzz);
        }
        int i4 = zzz.zzH;
        if (i4 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
            if (codecCapabilities == null) {
                zzk("sampleRate.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                zzk("sampleRate.aCaps");
                return false;
            } else if (!audioCapabilities.isSampleRateSupported(i4)) {
                zzk("sampleRate.support, " + i4);
                return false;
            }
        }
        int i5 = zzz.zzG;
        if (i5 == -1) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.zzd;
        if (codecCapabilities2 == null) {
            zzk("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
        if (audioCapabilities2 == null) {
            zzk("channelCount.aCaps");
            return false;
        }
        String str = this.zza;
        String str2 = this.zzb;
        int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
        if (maxInputChannelCount <= 1 && maxInputChannelCount <= 0 && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2)) {
            if ("audio/ac3".equals(str2)) {
                i = 6;
            } else {
                i = "audio/eac3".equals(str2) ? 16 : 30;
            }
            zzea.zzf("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i + "]");
            maxInputChannelCount = i;
        }
        if (maxInputChannelCount >= i5) {
            return true;
        }
        zzk("channelCount.support, " + i5);
        return false;
    }

    public final boolean zzg(zzz zzz) {
        if (this.zzi) {
            return this.zze;
        }
        int i = zzuc.zza;
        Pair zza2 = zzdk.zza(zzz);
        return zza2 != null && ((Integer) zza2.first).intValue() == 42;
    }

    public final boolean zzh(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null) {
            zzk("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            zzk("sizeAndRate.vCaps");
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int zza2 = zztk.zza(videoCapabilities, i, i2, d);
            if (zza2 != 2) {
                if (zza2 == 1) {
                    zzk("sizeAndRate.cover, " + i + "x" + i2 + "@" + d);
                    return false;
                }
            }
            return true;
        }
        if (!zzl(videoCapabilities, i, i2, d)) {
            if (i < i2) {
                String str = this.zza;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && zzl(videoCapabilities, i2, i, d)) {
                    zzea.zzb("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i + "x" + i2 + "@" + d) + "] [" + str + ", " + this.zzb + "] [" + zzex.zza + "]");
                }
            }
            zzk("sizeAndRate.support, " + i + "x" + i2 + "@" + d);
            return false;
        }
        return true;
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzi() {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || codecCapabilities.profileLevels == null) {
            return new MediaCodecInfo.CodecProfileLevel[0];
        }
        return codecCapabilities.profileLevels;
    }

    zzti(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        str.getClass();
        String str4 = str;
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = codecCapabilities;
        this.zzg = z;
        this.zze = z4;
        this.zzf = z6;
        this.zzh = z7;
        this.zzi = zzay.zzj(str2);
    }
}
