package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzpd implements zzmr, zzpe {
    private boolean zzA;
    private final Context zza;
    private final Executor zzb = zzde.zza();
    private final zzpf zzc;
    private final PlaybackSession zzd;
    private final long zze = SystemClock.elapsedRealtime();
    private final zzbk zzf = new zzbk();
    private final zzbj zzg = new zzbj();
    private final HashMap zzh = new HashMap();
    private final HashMap zzi = new HashMap();
    private String zzj;
    private PlaybackMetrics.Builder zzk;
    private int zzl;
    private int zzm = 0;
    private int zzn = 0;
    private zzba zzo;
    private zzpc zzp;
    private zzpc zzq;
    private zzpc zzr;
    private zzz zzs;
    private zzz zzt;
    private zzz zzu;
    private boolean zzv;
    private boolean zzw;
    private int zzx;
    private int zzy;
    private int zzz;

    private zzpd(Context context, PlaybackSession playbackSession) {
        this.zza = context.getApplicationContext();
        this.zzd = playbackSession;
        zzow zzow = new zzow(zzow.zza);
        this.zzc = zzow;
        zzow.zzh(this);
    }

    @RequiresNonNull({"metricsBuilder"})
    private final void zzA(zzbl zzbl, zzvh zzvh) {
        int zza2;
        PlaybackMetrics.Builder builder = this.zzk;
        if (zzvh != null && (zza2 = zzbl.zza(zzvh.zza)) != -1) {
            zzbj zzbj = this.zzg;
            int i = 0;
            zzbl.zzd(zza2, zzbj, false);
            zzbk zzbk = this.zzf;
            zzbl.zze(zzbj.zzc, zzbk, 0);
            zzak zzak = zzbk.zzd.zzb;
            int i2 = 2;
            if (zzak != null) {
                int zzo2 = zzex.zzo(zzak.zza);
                i = zzo2 != 0 ? zzo2 != 1 ? zzo2 != 2 ? 1 : 4 : 5 : 3;
            }
            builder.setStreamType(i);
            long j = zzbk.zzm;
            if (j != -9223372036854775807L && !zzbk.zzk && !zzbk.zzi && !zzbk.zzb()) {
                builder.setMediaDurationMillis(zzex.zzv(j));
            }
            if (true != zzbk.zzb()) {
                i2 = 1;
            }
            builder.setPlaybackType(i2);
            this.zzA = true;
        }
    }

    private final void zzB(long j, zzz zzz2, int i) {
        if (!Objects.equals(this.zzs, zzz2)) {
            int i2 = this.zzs == null ? 1 : 0;
            this.zzs = zzz2;
            zzC(1, j, zzz2, i2);
        }
    }

    private final void zzC(int i, long j, zzz zzz2, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.zze);
        if (zzz2 != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i2 != 1 ? 1 : 2);
            String str = zzz2.zzn;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = zzz2.zzo;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = zzz2.zzk;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i3 = zzz2.zzj;
            if (i3 != -1) {
                timeSinceCreatedMillis.setBitrate(i3);
            }
            int i4 = zzz2.zzv;
            if (i4 != -1) {
                timeSinceCreatedMillis.setWidth(i4);
            }
            int i5 = zzz2.zzw;
            if (i5 != -1) {
                timeSinceCreatedMillis.setHeight(i5);
            }
            int i6 = zzz2.zzG;
            if (i6 != -1) {
                timeSinceCreatedMillis.setChannelCount(i6);
            }
            int i7 = zzz2.zzH;
            if (i7 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i7);
            }
            String str4 = zzz2.zzd;
            if (str4 != null) {
                String str5 = zzex.zza;
                String[] split = str4.split("-", -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                if (create.second != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) create.second);
                }
            }
            float f = zzz2.zzz;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.zzA = true;
        this.zzb.execute(new zzox(this, timeSinceCreatedMillis.build()));
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    private final boolean zzD(zzpc zzpc) {
        if (zzpc == null) {
            return false;
        }
        return zzpc.zzc.equals(this.zzc.zze());
    }

    public static zzpd zzb(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new zzpd(context, mediaMetricsManager.createPlaybackSession());
    }

    private static int zzw(int i) {
        switch (zzex.zzl(i)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private final void zzx() {
        long j;
        long j2;
        PlaybackMetrics.Builder builder = this.zzk;
        if (builder != null && this.zzA) {
            builder.setAudioUnderrunCount(this.zzz);
            this.zzk.setVideoFramesDropped(this.zzx);
            this.zzk.setVideoFramesPlayed(this.zzy);
            Long l = (Long) this.zzh.get(this.zzj);
            PlaybackMetrics.Builder builder2 = this.zzk;
            if (l == null) {
                j = 0;
            } else {
                j = l.longValue();
            }
            builder2.setNetworkTransferDurationMillis(j);
            Long l2 = (Long) this.zzi.get(this.zzj);
            PlaybackMetrics.Builder builder3 = this.zzk;
            if (l2 == null) {
                j2 = 0;
            } else {
                j2 = l2.longValue();
            }
            builder3.setNetworkBytesRead(j2);
            this.zzk.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.zzb.execute(new zzpa(this, this.zzk.build()));
        }
        this.zzk = null;
        this.zzj = null;
        this.zzz = 0;
        this.zzx = 0;
        this.zzy = 0;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzA = false;
    }

    private final void zzy(long j, zzz zzz2, int i) {
        if (!Objects.equals(this.zzt, zzz2)) {
            int i2 = this.zzt == null ? 1 : 0;
            this.zzt = zzz2;
            zzC(0, j, zzz2, i2);
        }
    }

    private final void zzz(long j, zzz zzz2, int i) {
        if (!Objects.equals(this.zzu, zzz2)) {
            int i2 = this.zzu == null ? 1 : 0;
            this.zzu = zzz2;
            zzC(2, j, zzz2, i2);
        }
    }

    public final LogSessionId zza() {
        return this.zzd.getSessionId();
    }

    public final /* synthetic */ void zze(zzmp zzmp, zzz zzz2, zzie zzie) {
    }

    public final void zzf(zzmp zzmp, int i, long j, long j2) {
        long j3;
        zzvh zzvh = zzmp.zzd;
        if (zzvh != null) {
            zzvh zzvh2 = zzvh;
            String zzf2 = this.zzc.zzf(zzmp.zzb, zzvh);
            HashMap hashMap = this.zzi;
            Long l = (Long) hashMap.get(zzf2);
            HashMap hashMap2 = this.zzh;
            Long l2 = (Long) hashMap2.get(zzf2);
            long j4 = 0;
            if (l == null) {
                j3 = 0;
            } else {
                j3 = l.longValue();
            }
            hashMap.put(zzf2, Long.valueOf(j3 + j));
            if (l2 != null) {
                j4 = l2.longValue();
            }
            hashMap2.put(zzf2, Long.valueOf(j4 + ((long) i)));
        }
    }

    public final void zzg(zzmp zzmp, zzvd zzvd) {
        zzvh zzvh = zzmp.zzd;
        if (zzvh != null) {
            zzz zzz2 = zzvd.zzb;
            zzz2.getClass();
            zzz zzz3 = zzz2;
            zzvh zzvh2 = zzvh;
            zzpc zzpc = new zzpc(zzz2, 0, this.zzc.zzf(zzmp.zzb, zzvh));
            int i = zzvd.zza;
            if (i != 0) {
                if (i == 1) {
                    this.zzq = zzpc;
                    return;
                } else if (i != 2) {
                    if (i == 3) {
                        this.zzr = zzpc;
                        return;
                    }
                    return;
                }
            }
            this.zzp = zzpc;
        }
    }

    public final /* synthetic */ void zzh(zzmp zzmp, int i, long j) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01ee, code lost:
        if (r12 != 1) goto L_0x01f2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzi(com.google.android.gms.internal.ads.zzbh r21, com.google.android.gms.internal.ads.zzmq r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            int r2 = r22.zzb()
            if (r2 != 0) goto L_0x000c
            goto L_0x03dc
        L_0x000c:
            r2 = 0
            r3 = r2
        L_0x000e:
            int r4 = r22.zzb()
            r5 = 11
            if (r3 >= r4) goto L_0x0038
            int r4 = r1.zza(r3)
            com.google.android.gms.internal.ads.zzmp r6 = r1.zzc(r4)
            if (r4 != 0) goto L_0x0026
            com.google.android.gms.internal.ads.zzpf r4 = r0.zzc
            r4.zzk(r6)
            goto L_0x0035
        L_0x0026:
            if (r4 != r5) goto L_0x0030
            com.google.android.gms.internal.ads.zzpf r4 = r0.zzc
            int r5 = r0.zzl
            r4.zzj(r6, r5)
            goto L_0x0035
        L_0x0030:
            com.google.android.gms.internal.ads.zzpf r4 = r0.zzc
            r4.zzi(r6)
        L_0x0035:
            int r3 = r3 + 1
            goto L_0x000e
        L_0x0038:
            long r3 = android.os.SystemClock.elapsedRealtime()
            boolean r6 = r1.zzd(r2)
            if (r6 == 0) goto L_0x0051
            com.google.android.gms.internal.ads.zzmp r6 = r1.zzc(r2)
            android.media.metrics.PlaybackMetrics$Builder r7 = r0.zzk
            if (r7 == 0) goto L_0x0051
            com.google.android.gms.internal.ads.zzbl r7 = r6.zzb
            com.google.android.gms.internal.ads.zzvh r6 = r6.zzd
            r0.zzA(r7, r6)
        L_0x0051:
            r6 = 2
            boolean r7 = r1.zzd(r6)
            r9 = 3
            r10 = 0
            r11 = 1
            if (r7 == 0) goto L_0x00cc
            android.media.metrics.PlaybackMetrics$Builder r7 = r0.zzk
            if (r7 == 0) goto L_0x00cc
            com.google.android.gms.internal.ads.zzbt r7 = r21.zzp()
            com.google.android.gms.internal.ads.zzfyq r7 = r7.zza()
            int r12 = r7.size()
            r13 = r2
        L_0x006c:
            if (r13 >= r12) goto L_0x0092
            java.lang.Object r14 = r7.get(r13)
            com.google.android.gms.internal.ads.zzbs r14 = (com.google.android.gms.internal.ads.zzbs) r14
            r15 = r2
        L_0x0075:
            int r5 = r14.zza
            int r16 = r13 + 1
            if (r15 >= r5) goto L_0x008d
            boolean r5 = r14.zzd(r15)
            if (r5 == 0) goto L_0x008a
            com.google.android.gms.internal.ads.zzz r5 = r14.zzb(r15)
            com.google.android.gms.internal.ads.zzs r5 = r5.zzs
            if (r5 == 0) goto L_0x008a
            goto L_0x0093
        L_0x008a:
            int r15 = r15 + 1
            goto L_0x0075
        L_0x008d:
            r13 = r16
            r5 = 11
            goto L_0x006c
        L_0x0092:
            r5 = r10
        L_0x0093:
            if (r5 == 0) goto L_0x00cc
            android.media.metrics.PlaybackMetrics$Builder r7 = r0.zzk
            java.lang.String r12 = com.google.android.gms.internal.ads.zzex.zza
            r12 = r7
            android.media.metrics.PlaybackMetrics$Builder r12 = (android.media.metrics.PlaybackMetrics.Builder) r12
            r12 = r2
        L_0x009d:
            int r13 = r5.zzb
            if (r12 >= r13) goto L_0x00c8
            com.google.android.gms.internal.ads.zzr r13 = r5.zza(r12)
            java.util.UUID r13 = r13.zza
            java.util.UUID r14 = com.google.android.gms.internal.ads.zzh.zzd
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto L_0x00b1
            r5 = r9
            goto L_0x00c9
        L_0x00b1:
            java.util.UUID r14 = com.google.android.gms.internal.ads.zzh.zze
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto L_0x00bb
            r5 = r6
            goto L_0x00c9
        L_0x00bb:
            java.util.UUID r14 = com.google.android.gms.internal.ads.zzh.zzc
            boolean r13 = r13.equals(r14)
            if (r13 == 0) goto L_0x00c5
            r5 = 6
            goto L_0x00c9
        L_0x00c5:
            int r12 = r12 + 1
            goto L_0x009d
        L_0x00c8:
            r5 = r11
        L_0x00c9:
            r7.setDrmType(r5)
        L_0x00cc:
            r5 = 1011(0x3f3, float:1.417E-42)
            boolean r5 = r1.zzd(r5)
            if (r5 == 0) goto L_0x00d9
            int r5 = r0.zzz
            int r5 = r5 + r11
            r0.zzz = r5
        L_0x00d9:
            com.google.android.gms.internal.ads.zzba r5 = r0.zzo
            r16 = 9
            if (r5 != 0) goto L_0x00e1
            goto L_0x027d
        L_0x00e1:
            android.content.Context r7 = r0.zza
            int r8 = r5.zza
            r12 = 1001(0x3e9, float:1.403E-42)
            if (r8 != r12) goto L_0x00ee
            r7 = 20
        L_0x00eb:
            r8 = r2
            goto L_0x0252
        L_0x00ee:
            r12 = r5
            com.google.android.gms.internal.ads.zzin r12 = (com.google.android.gms.internal.ads.zzin) r12
            int r13 = r12.zzc
            if (r13 != r11) goto L_0x00f7
            r13 = r11
            goto L_0x00f8
        L_0x00f7:
            r13 = r2
        L_0x00f8:
            int r12 = r12.zzg
            java.lang.Throwable r14 = r5.getCause()
            r14.getClass()
            r17 = r14
            java.lang.Throwable r17 = (java.lang.Throwable) r17
            boolean r15 = r14 instanceof java.io.IOException
            r18 = 23
            if (r15 == 0) goto L_0x01e8
            boolean r12 = r14 instanceof com.google.android.gms.internal.ads.zzhc
            if (r12 == 0) goto L_0x0117
            com.google.android.gms.internal.ads.zzhc r14 = (com.google.android.gms.internal.ads.zzhc) r14
            int r7 = r14.zzc
            r8 = r7
            r7 = 5
            goto L_0x0252
        L_0x0117:
            boolean r12 = r14 instanceof com.google.android.gms.internal.ads.zzhb
            if (r12 != 0) goto L_0x01e3
            boolean r12 = r14 instanceof com.google.android.gms.internal.ads.zzaz
            if (r12 == 0) goto L_0x0121
            goto L_0x01e3
        L_0x0121:
            boolean r12 = r14 instanceof com.google.android.gms.internal.ads.zzha
            if (r12 != 0) goto L_0x01b0
            boolean r13 = r14 instanceof com.google.android.gms.internal.ads.zzhk
            if (r13 == 0) goto L_0x012b
            goto L_0x01b0
        L_0x012b:
            r7 = 1002(0x3ea, float:1.404E-42)
            if (r8 != r7) goto L_0x0132
            r7 = 21
            goto L_0x00eb
        L_0x0132:
            boolean r7 = r14 instanceof com.google.android.gms.internal.ads.zzsa
            if (r7 == 0) goto L_0x017b
            java.lang.Throwable r7 = r14.getCause()
            r7.getClass()
            r8 = r7
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            boolean r8 = r7 instanceof android.media.MediaDrm.MediaDrmStateException
            if (r8 == 0) goto L_0x0154
            android.media.MediaDrm$MediaDrmStateException r7 = (android.media.MediaDrm.MediaDrmStateException) r7
            java.lang.String r7 = r7.getDiagnosticInfo()
            int r7 = com.google.android.gms.internal.ads.zzex.zzm(r7)
            int r8 = zzw(r7)
            goto L_0x021c
        L_0x0154:
            boolean r8 = r7 instanceof android.media.MediaDrmResetException
            if (r8 == 0) goto L_0x015b
            r7 = 27
            goto L_0x00eb
        L_0x015b:
            boolean r8 = r7 instanceof android.media.NotProvisionedException
            if (r8 == 0) goto L_0x0162
            r7 = 24
            goto L_0x00eb
        L_0x0162:
            boolean r8 = r7 instanceof android.media.DeniedByServerException
            if (r8 == 0) goto L_0x0169
            r7 = 29
            goto L_0x00eb
        L_0x0169:
            boolean r8 = r7 instanceof com.google.android.gms.internal.ads.zzsk
            if (r8 == 0) goto L_0x016f
            goto L_0x01fe
        L_0x016f:
            boolean r7 = r7 instanceof com.google.android.gms.internal.ads.zzrz
            if (r7 == 0) goto L_0x0177
            r7 = 28
            goto L_0x00eb
        L_0x0177:
            r7 = 30
            goto L_0x00eb
        L_0x017b:
            boolean r7 = r14 instanceof com.google.android.gms.internal.ads.zzgx
            if (r7 == 0) goto L_0x01ab
            java.lang.Throwable r7 = r14.getCause()
            boolean r7 = r7 instanceof java.io.FileNotFoundException
            if (r7 == 0) goto L_0x01ab
            java.lang.Throwable r7 = r14.getCause()
            r7.getClass()
            r8 = r7
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            java.lang.Throwable r7 = r7.getCause()
            boolean r8 = r7 instanceof android.system.ErrnoException
            r12 = 31
            if (r8 == 0) goto L_0x01a7
            android.system.ErrnoException r7 = (android.system.ErrnoException) r7
            int r7 = r7.errno
            int r8 = android.system.OsConstants.EACCES
            if (r7 != r8) goto L_0x01a7
            r7 = 32
            goto L_0x00eb
        L_0x01a7:
            r8 = r2
            r7 = r12
            goto L_0x0252
        L_0x01ab:
            r8 = r2
            r7 = r16
            goto L_0x0252
        L_0x01b0:
            com.google.android.gms.internal.ads.zzel r7 = com.google.android.gms.internal.ads.zzel.zzb(r7)
            int r7 = r7.zza()
            if (r7 != r11) goto L_0x01be
            r8 = r2
            r7 = r9
            goto L_0x0252
        L_0x01be:
            java.lang.Throwable r7 = r14.getCause()
            boolean r8 = r7 instanceof java.net.UnknownHostException
            if (r8 == 0) goto L_0x01ca
            r8 = r2
            r7 = 6
            goto L_0x0252
        L_0x01ca:
            boolean r7 = r7 instanceof java.net.SocketTimeoutException
            if (r7 == 0) goto L_0x01d2
            r8 = r2
            r7 = 7
            goto L_0x0252
        L_0x01d2:
            if (r12 == 0) goto L_0x01de
            com.google.android.gms.internal.ads.zzha r14 = (com.google.android.gms.internal.ads.zzha) r14
            int r7 = r14.zzb
            if (r7 != r11) goto L_0x01de
            r8 = r2
            r7 = 4
            goto L_0x0252
        L_0x01de:
            r8 = r2
            r7 = 8
            goto L_0x0252
        L_0x01e3:
            r8 = r2
            r7 = 11
            goto L_0x0252
        L_0x01e8:
            if (r13 == 0) goto L_0x01f2
            r7 = 35
            if (r12 == 0) goto L_0x00eb
            if (r12 != r11) goto L_0x01f2
            goto L_0x00eb
        L_0x01f2:
            if (r13 == 0) goto L_0x01fa
            if (r12 != r9) goto L_0x01fa
            r7 = 15
            goto L_0x00eb
        L_0x01fa:
            if (r13 == 0) goto L_0x0202
            if (r12 != r6) goto L_0x0202
        L_0x01fe:
            r8 = r2
            r7 = r18
            goto L_0x0252
        L_0x0202:
            boolean r7 = r14 instanceof com.google.android.gms.internal.ads.zztl
            if (r7 == 0) goto L_0x0212
            com.google.android.gms.internal.ads.zztl r14 = (com.google.android.gms.internal.ads.zztl) r14
            java.lang.String r7 = r14.zzd
            int r7 = com.google.android.gms.internal.ads.zzex.zzm(r7)
            r8 = r7
            r7 = 13
            goto L_0x0252
        L_0x0212:
            boolean r7 = r14 instanceof com.google.android.gms.internal.ads.zzth
            r8 = 14
            if (r7 == 0) goto L_0x0222
            com.google.android.gms.internal.ads.zzth r14 = (com.google.android.gms.internal.ads.zzth) r14
            int r7 = r14.zza
        L_0x021c:
            r19 = r8
            r8 = r7
            r7 = r19
            goto L_0x0252
        L_0x0222:
            boolean r7 = r14 instanceof java.lang.OutOfMemoryError
            if (r7 == 0) goto L_0x0229
            r7 = r8
            goto L_0x00eb
        L_0x0229:
            boolean r7 = r14 instanceof com.google.android.gms.internal.ads.zzqk
            if (r7 == 0) goto L_0x0234
            com.google.android.gms.internal.ads.zzqk r14 = (com.google.android.gms.internal.ads.zzqk) r14
            int r7 = r14.zza
            r8 = 17
            goto L_0x021c
        L_0x0234:
            boolean r7 = r14 instanceof com.google.android.gms.internal.ads.zzqn
            if (r7 == 0) goto L_0x023f
            com.google.android.gms.internal.ads.zzqn r14 = (com.google.android.gms.internal.ads.zzqn) r14
            int r7 = r14.zza
            r8 = 18
            goto L_0x021c
        L_0x023f:
            boolean r7 = r14 instanceof android.media.MediaCodec.CryptoException
            if (r7 == 0) goto L_0x024e
            android.media.MediaCodec$CryptoException r14 = (android.media.MediaCodec.CryptoException) r14
            int r7 = r14.getErrorCode()
            int r8 = zzw(r7)
            goto L_0x021c
        L_0x024e:
            r7 = 22
            goto L_0x00eb
        L_0x0252:
            android.media.metrics.PlaybackErrorEvent$Builder r12 = new android.media.metrics.PlaybackErrorEvent$Builder
            r12.<init>()
            long r13 = r0.zze
            long r13 = r3 - r13
            android.media.metrics.PlaybackErrorEvent$Builder r12 = r12.setTimeSinceCreatedMillis(r13)
            android.media.metrics.PlaybackErrorEvent$Builder r7 = r12.setErrorCode(r7)
            android.media.metrics.PlaybackErrorEvent$Builder r7 = r7.setSubErrorCode(r8)
            android.media.metrics.PlaybackErrorEvent$Builder r5 = r7.setException(r5)
            android.media.metrics.PlaybackErrorEvent r5 = r5.build()
            java.util.concurrent.Executor r7 = r0.zzb
            com.google.android.gms.internal.ads.zzoz r8 = new com.google.android.gms.internal.ads.zzoz
            r8.<init>(r0, r5)
            r7.execute(r8)
            r0.zzA = r11
            r0.zzo = r10
        L_0x027d:
            boolean r5 = r1.zzd(r6)
            if (r5 == 0) goto L_0x02a9
            com.google.android.gms.internal.ads.zzbt r5 = r21.zzp()
            boolean r7 = r5.zzb(r6)
            boolean r8 = r5.zzb(r11)
            boolean r5 = r5.zzb(r9)
            if (r7 != 0) goto L_0x029a
            if (r8 != 0) goto L_0x029a
            if (r5 == 0) goto L_0x02a9
            r5 = r11
        L_0x029a:
            if (r7 != 0) goto L_0x029f
            r0.zzB(r3, r10, r2)
        L_0x029f:
            if (r8 != 0) goto L_0x02a4
            r0.zzy(r3, r10, r2)
        L_0x02a4:
            if (r5 != 0) goto L_0x02a9
            r0.zzz(r3, r10, r2)
        L_0x02a9:
            com.google.android.gms.internal.ads.zzpc r5 = r0.zzp
            boolean r5 = r0.zzD(r5)
            if (r5 == 0) goto L_0x02c1
            com.google.android.gms.internal.ads.zzpc r5 = r0.zzp
            com.google.android.gms.internal.ads.zzz r7 = r5.zza
            int r8 = r7.zzw
            r12 = -1
            if (r8 == r12) goto L_0x02c1
            int r5 = r5.zzb
            r0.zzB(r3, r7, r2)
            r0.zzp = r10
        L_0x02c1:
            com.google.android.gms.internal.ads.zzpc r5 = r0.zzq
            boolean r5 = r0.zzD(r5)
            if (r5 == 0) goto L_0x02d4
            com.google.android.gms.internal.ads.zzpc r5 = r0.zzq
            com.google.android.gms.internal.ads.zzz r7 = r5.zza
            int r5 = r5.zzb
            r0.zzy(r3, r7, r2)
            r0.zzq = r10
        L_0x02d4:
            com.google.android.gms.internal.ads.zzpc r5 = r0.zzr
            boolean r5 = r0.zzD(r5)
            if (r5 == 0) goto L_0x02e7
            com.google.android.gms.internal.ads.zzpc r5 = r0.zzr
            com.google.android.gms.internal.ads.zzz r7 = r5.zza
            int r5 = r5.zzb
            r0.zzz(r3, r7, r2)
            r0.zzr = r10
        L_0x02e7:
            android.content.Context r5 = r0.zza
            com.google.android.gms.internal.ads.zzel r5 = com.google.android.gms.internal.ads.zzel.zzb(r5)
            int r5 = r5.zza()
            switch(r5) {
                case 0: goto L_0x0308;
                case 1: goto L_0x0305;
                case 2: goto L_0x0303;
                case 3: goto L_0x0301;
                case 4: goto L_0x02ff;
                case 5: goto L_0x02fd;
                case 6: goto L_0x02f4;
                case 7: goto L_0x02fb;
                case 8: goto L_0x02f4;
                case 9: goto L_0x02f8;
                case 10: goto L_0x02f6;
                default: goto L_0x02f4;
            }
        L_0x02f4:
            r13 = r11
            goto L_0x0309
        L_0x02f6:
            r13 = 7
            goto L_0x0309
        L_0x02f8:
            r13 = 8
            goto L_0x0309
        L_0x02fb:
            r13 = r9
            goto L_0x0309
        L_0x02fd:
            r13 = 6
            goto L_0x0309
        L_0x02ff:
            r13 = 5
            goto L_0x0309
        L_0x0301:
            r13 = 4
            goto L_0x0309
        L_0x0303:
            r13 = r6
            goto L_0x0309
        L_0x0305:
            r13 = r16
            goto L_0x0309
        L_0x0308:
            r13 = r2
        L_0x0309:
            int r5 = r0.zzn
            if (r13 == r5) goto L_0x032e
            r0.zzn = r13
            android.media.metrics.NetworkEvent$Builder r5 = new android.media.metrics.NetworkEvent$Builder
            r5.<init>()
            android.media.metrics.NetworkEvent$Builder r5 = r5.setNetworkType(r13)
            long r7 = r0.zze
            long r7 = r3 - r7
            android.media.metrics.NetworkEvent$Builder r5 = r5.setTimeSinceCreatedMillis(r7)
            android.media.metrics.NetworkEvent r5 = r5.build()
            java.util.concurrent.Executor r7 = r0.zzb
            com.google.android.gms.internal.ads.zzoy r8 = new com.google.android.gms.internal.ads.zzoy
            r8.<init>(r0, r5)
            r7.execute(r8)
        L_0x032e:
            int r5 = r21.zzg()
            if (r5 == r6) goto L_0x0336
            r0.zzv = r2
        L_0x0336:
            r5 = r21
            com.google.android.gms.internal.ads.zzmk r5 = (com.google.android.gms.internal.ads.zzmk) r5
            com.google.android.gms.internal.ads.zzin r5 = r5.zzD()
            r7 = 10
            if (r5 != 0) goto L_0x0345
            r0.zzw = r2
            goto L_0x034d
        L_0x0345:
            boolean r2 = r1.zzd(r7)
            if (r2 == 0) goto L_0x034d
            r0.zzw = r11
        L_0x034d:
            int r2 = r21.zzg()
            boolean r5 = r0.zzv
            if (r5 == 0) goto L_0x0357
            r5 = 5
            goto L_0x03a3
        L_0x0357:
            boolean r5 = r0.zzw
            if (r5 == 0) goto L_0x035e
            r5 = 13
            goto L_0x03a3
        L_0x035e:
            r5 = 4
            if (r2 != r5) goto L_0x0364
            r5 = 11
            goto L_0x03a3
        L_0x0364:
            r8 = 12
            if (r2 != r6) goto L_0x0385
            int r2 = r0.zzm
            if (r2 == 0) goto L_0x0383
            if (r2 == r6) goto L_0x0383
            if (r2 != r8) goto L_0x0371
            goto L_0x0383
        L_0x0371:
            boolean r2 = r21.zzv()
            if (r2 != 0) goto L_0x0379
            r5 = 7
            goto L_0x03a3
        L_0x0379:
            int r2 = r21.zzh()
            if (r2 == 0) goto L_0x0381
            r5 = r7
            goto L_0x03a3
        L_0x0381:
            r5 = 6
            goto L_0x03a3
        L_0x0383:
            r5 = r6
            goto L_0x03a3
        L_0x0385:
            if (r2 != r9) goto L_0x0399
            boolean r2 = r21.zzv()
            if (r2 != 0) goto L_0x038e
            goto L_0x03a3
        L_0x038e:
            int r2 = r21.zzh()
            if (r2 == 0) goto L_0x0397
            r5 = r16
            goto L_0x03a3
        L_0x0397:
            r5 = r9
            goto L_0x03a3
        L_0x0399:
            if (r2 != r11) goto L_0x03a1
            int r2 = r0.zzm
            if (r2 == 0) goto L_0x03a1
            r5 = r8
            goto L_0x03a3
        L_0x03a1:
            int r5 = r0.zzm
        L_0x03a3:
            int r2 = r0.zzm
            if (r2 == r5) goto L_0x03cb
            r0.zzm = r5
            r0.zzA = r11
            android.media.metrics.PlaybackStateEvent$Builder r2 = new android.media.metrics.PlaybackStateEvent$Builder
            r2.<init>()
            int r5 = r0.zzm
            android.media.metrics.PlaybackStateEvent$Builder r2 = r2.setState(r5)
            long r5 = r0.zze
            long r3 = r3 - r5
            android.media.metrics.PlaybackStateEvent$Builder r2 = r2.setTimeSinceCreatedMillis(r3)
            android.media.metrics.PlaybackStateEvent r2 = r2.build()
            java.util.concurrent.Executor r3 = r0.zzb
            com.google.android.gms.internal.ads.zzpb r4 = new com.google.android.gms.internal.ads.zzpb
            r4.<init>(r0, r2)
            r3.execute(r4)
        L_0x03cb:
            r2 = 1028(0x404, float:1.44E-42)
            boolean r3 = r1.zzd(r2)
            if (r3 == 0) goto L_0x03dc
            com.google.android.gms.internal.ads.zzpf r3 = r0.zzc
            com.google.android.gms.internal.ads.zzmp r1 = r1.zzc(r2)
            r3.zzg(r1)
        L_0x03dc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpd.zzi(com.google.android.gms.internal.ads.zzbh, com.google.android.gms.internal.ads.zzmq):void");
    }

    public final void zzj(zzmp zzmp, zzuy zzuy, zzvd zzvd, IOException iOException, boolean z) {
    }

    public final /* synthetic */ void zzk(zzmp zzmp, int i) {
    }

    public final void zzl(zzmp zzmp, zzba zzba) {
        this.zzo = zzba;
    }

    public final void zzm(zzmp zzmp, zzbf zzbf, zzbf zzbf2, int i) {
        if (i == 1) {
            this.zzv = true;
            i = 1;
        }
        this.zzl = i;
    }

    public final /* synthetic */ void zzn(zzmp zzmp, Object obj, long j) {
    }

    public final void zzo(zzmp zzmp, zzid zzid) {
        this.zzx += zzid.zzg;
        this.zzy += zzid.zze;
    }

    public final /* synthetic */ void zzp(zzmp zzmp, zzz zzz2, zzie zzie) {
    }

    public final void zzq(zzmp zzmp, zzcd zzcd) {
        zzpc zzpc = this.zzp;
        if (zzpc != null) {
            zzz zzz2 = zzpc.zza;
            if (zzz2.zzw == -1) {
                zzx zzb2 = zzz2.zzb();
                zzb2.zzam(zzcd.zzb);
                zzb2.zzQ(zzcd.zzc);
                this.zzp = new zzpc(zzb2.zzan(), 0, zzpc.zzc);
            }
        }
    }

    public final void zzu(zzmp zzmp, String str) {
        zzvh zzvh = zzmp.zzd;
        if (zzvh == null || !zzvh.zzb()) {
            zzx();
            this.zzj = str;
            this.zzk = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.8.0-alpha01");
            zzA(zzmp.zzb, zzvh);
        }
    }

    public final void zzv(zzmp zzmp, String str, boolean z) {
        zzvh zzvh = zzmp.zzd;
        if ((zzvh == null || !zzvh.zzb()) && str.equals(this.zzj)) {
            zzx();
        }
        this.zzh.remove(str);
        this.zzi.remove(str);
    }
}
