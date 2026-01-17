package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcbf extends zzcbh implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {
    private static final Map zzc;
    private final zzccb zzd;
    private final zzccc zze;
    private final boolean zzf;
    private final zzdsj zzg;
    private int zzh = 0;
    private int zzi = 0;
    private MediaPlayer zzj;
    private Uri zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private zzcbz zzo;
    private final boolean zzp;
    private int zzq;
    /* access modifiers changed from: private */
    public zzcbg zzr;
    /* access modifiers changed from: private */
    public boolean zzs = false;
    private Integer zzt = null;

    static {
        HashMap hashMap = new HashMap();
        zzc = hashMap;
        hashMap.put(-1004, "MEDIA_ERROR_IO");
        hashMap.put(-1007, "MEDIA_ERROR_MALFORMED");
        hashMap.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        hashMap.put(-110, "MEDIA_ERROR_TIMED_OUT");
        hashMap.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        hashMap.put(100, "MEDIA_ERROR_SERVER_DIED");
        hashMap.put(1, "MEDIA_ERROR_UNKNOWN");
        hashMap.put(1, "MEDIA_INFO_UNKNOWN");
        hashMap.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        hashMap.put(701, "MEDIA_INFO_BUFFERING_START");
        hashMap.put(702, "MEDIA_INFO_BUFFERING_END");
        hashMap.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        hashMap.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        hashMap.put(802, "MEDIA_INFO_METADATA_UPDATE");
        hashMap.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        hashMap.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public zzcbf(Context context, zzccb zzccb, boolean z, boolean z2, zzcca zzcca, zzccc zzccc, zzdsj zzdsj) {
        super(context);
        this.zzd = zzccb;
        this.zze = zzccc;
        this.zzp = z;
        this.zzf = z2;
        zzccc.zza(this);
        this.zzg = zzdsj;
    }

    private final void zzD() {
        zzdsj zzdsj;
        zze.zza("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.zzk != null && surfaceTexture != null) {
            zzE(false);
            try {
                zzv.zzl();
                MediaPlayer mediaPlayer = new MediaPlayer();
                this.zzj = mediaPlayer;
                mediaPlayer.setOnBufferingUpdateListener(this);
                this.zzj.setOnCompletionListener(this);
                this.zzj.setOnErrorListener(this);
                this.zzj.setOnInfoListener(this);
                this.zzj.setOnPreparedListener(this);
                this.zzj.setOnVideoSizeChangedListener(this);
                this.zzn = 0;
                if (this.zzp) {
                    if (((Boolean) zzbd.zzc().zzb(zzbde.zznF)).booleanValue() && (zzdsj = this.zzg) != null) {
                        zzdsi zza = zzdsj.zza();
                        zza.zzb("action", "svp_ampv");
                        zza.zzj();
                    }
                    zzcbz zzcbz = new zzcbz(getContext());
                    this.zzo = zzcbz;
                    zzcbz.zzd(surfaceTexture, getWidth(), getHeight());
                    zzcbz zzcbz2 = this.zzo;
                    zzcbz2.start();
                    SurfaceTexture zzb = zzcbz2.zzb();
                    if (zzb != null) {
                        surfaceTexture = zzb;
                    } else {
                        this.zzo.zze();
                        this.zzo = null;
                    }
                }
                this.zzj.setDataSource(getContext(), this.zzk);
                zzv.zzm();
                this.zzj.setSurface(new Surface(surfaceTexture));
                this.zzj.setAudioStreamType(3);
                this.zzj.setScreenOnWhilePlaying(true);
                this.zzj.prepareAsync();
                zzF(1);
            } catch (IOException | IllegalArgumentException | IllegalStateException e) {
                zzo.zzk("Failed to initialize MediaPlayer at ".concat(String.valueOf(String.valueOf(this.zzk))), e);
                onError(this.zzj, 1, 0);
            }
        }
    }

    private final void zzE(boolean z) {
        zze.zza("AdMediaPlayerView release");
        zzcbz zzcbz = this.zzo;
        if (zzcbz != null) {
            zzcbz.zze();
            this.zzo = null;
        }
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.zzj.release();
            this.zzj = null;
            zzF(0);
            if (z) {
                this.zzi = 0;
            }
        }
    }

    private final void zzF(int i) {
        if (i == 3) {
            this.zze.zzc();
            this.zzb.zzb();
        } else if (this.zzh == 3) {
            this.zze.zze();
            this.zzb.zzc();
        }
        this.zzh = i;
    }

    private final void zzG(float f) {
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setVolume(f, f);
            } catch (IllegalStateException unused) {
            }
        } else {
            int i = zze.zza;
            zzo.zzj("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.zzh;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zzH() {
        /*
            r2 = this;
            android.media.MediaPlayer r0 = r2.zzj
            if (r0 == 0) goto L_0x000f
            int r0 = r2.zzh
            r1 = -1
            if (r0 == r1) goto L_0x000f
            if (r0 == 0) goto L_0x000f
            r1 = 1
            if (r0 == r1) goto L_0x000f
            return r1
        L_0x000f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcbf.zzH():boolean");
    }

    public static /* synthetic */ void zzk(zzcbf zzcbf, int i) {
        zzcbg zzcbg = zzcbf.zzr;
        if (zzcbg != null) {
            zzcbg.onWindowVisibilityChanged(i);
        }
    }

    static /* bridge */ /* synthetic */ void zzm(zzcbf zzcbf, MediaPlayer mediaPlayer) {
        MediaFormat format;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzcc)).booleanValue() && zzcbf.zzd != null && mediaPlayer != null) {
            try {
                MediaPlayer.TrackInfo[] trackInfo = mediaPlayer.getTrackInfo();
                if (trackInfo != null) {
                    HashMap hashMap = new HashMap();
                    for (MediaPlayer.TrackInfo trackInfo2 : trackInfo) {
                        if (trackInfo2 != null) {
                            int trackType = trackInfo2.getTrackType();
                            if (trackType == 1) {
                                MediaFormat format2 = trackInfo2.getFormat();
                                if (format2 != null) {
                                    if (format2.containsKey("frame-rate")) {
                                        try {
                                            hashMap.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                                        } catch (ClassCastException unused) {
                                            hashMap.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                                        }
                                    }
                                    if (format2.containsKey("bitrate")) {
                                        Integer valueOf = Integer.valueOf(format2.getInteger("bitrate"));
                                        zzcbf.zzt = valueOf;
                                        hashMap.put("bitRate", String.valueOf(valueOf));
                                    }
                                    if (format2.containsKey("width") && format2.containsKey("height")) {
                                        hashMap.put("resolution", format2.getInteger("width") + "x" + format2.getInteger("height"));
                                    }
                                    if (format2.containsKey("mime")) {
                                        hashMap.put("videoMime", format2.getString("mime"));
                                    }
                                    if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                                        hashMap.put("videoCodec", format2.getString("codecs-string"));
                                    }
                                }
                            } else if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                                if (format.containsKey("mime")) {
                                    hashMap.put("audioMime", format.getString("mime"));
                                }
                                if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                                    hashMap.put("audioCodec", format.getString("codecs-string"));
                                }
                            }
                        }
                    }
                    if (!hashMap.isEmpty()) {
                        zzcbf.zzd.zzd("onMetadataEvent", hashMap);
                    }
                }
            } catch (RuntimeException e) {
                zzv.zzp().zzw(e, "AdMediaPlayerView.reportMetadata");
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.zzn = i;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        zze.zza("AdMediaPlayerView completion");
        zzF(5);
        this.zzi = 5;
        zzs.zza.post(new zzcay(this));
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Map map = zzc;
        String str = (String) map.get(Integer.valueOf(i));
        String str2 = (String) map.get(Integer.valueOf(i2));
        int i3 = zze.zza;
        zzo.zzj("AdMediaPlayerView MediaPlayer error: " + str + ":" + str2);
        zzF(-1);
        this.zzi = -1;
        zzs.zza.post(new zzcaz(this, str, str2));
        return true;
    }

    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        Map map = zzc;
        zze.zza("AdMediaPlayerView MediaPlayer info: " + ((String) map.get(Integer.valueOf(i))) + ":" + ((String) map.get(Integer.valueOf(i2))));
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005e, code lost:
        if (r1 > r6) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.zzl
            int r0 = getDefaultSize(r0, r6)
            int r1 = r5.zzm
            int r1 = getDefaultSize(r1, r7)
            int r2 = r5.zzl
            if (r2 <= 0) goto L_0x007a
            int r2 = r5.zzm
            if (r2 <= 0) goto L_0x007a
            com.google.android.gms.internal.ads.zzcbz r2 = r5.zzo
            if (r2 != 0) goto L_0x007a
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L_0x0042
            if (r1 != r2) goto L_0x0041
            int r0 = r5.zzl
            int r1 = r0 * r7
            int r2 = r5.zzm
            int r3 = r6 * r2
            if (r1 >= r3) goto L_0x003c
            int r0 = r1 / r2
        L_0x003a:
            r1 = r7
            goto L_0x007a
        L_0x003c:
            if (r1 <= r3) goto L_0x0060
            int r1 = r3 / r0
            goto L_0x0052
        L_0x0041:
            r0 = r2
        L_0x0042:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L_0x0054
            int r0 = r5.zzm
            int r0 = r0 * r6
            int r2 = r5.zzl
            int r0 = r0 / r2
            if (r1 != r3) goto L_0x0051
            if (r0 <= r7) goto L_0x0051
            goto L_0x0060
        L_0x0051:
            r1 = r0
        L_0x0052:
            r0 = r6
            goto L_0x007a
        L_0x0054:
            if (r1 != r2) goto L_0x0064
            int r1 = r5.zzl
            int r1 = r1 * r7
            int r2 = r5.zzm
            int r1 = r1 / r2
            if (r0 != r3) goto L_0x0062
            if (r1 <= r6) goto L_0x0062
        L_0x0060:
            r0 = r6
            goto L_0x003a
        L_0x0062:
            r0 = r1
            goto L_0x003a
        L_0x0064:
            int r2 = r5.zzl
            int r4 = r5.zzm
            if (r1 != r3) goto L_0x0070
            if (r4 <= r7) goto L_0x0070
            int r1 = r7 * r2
            int r1 = r1 / r4
            goto L_0x0072
        L_0x0070:
            r1 = r2
            r7 = r4
        L_0x0072:
            if (r0 != r3) goto L_0x0062
            if (r1 <= r6) goto L_0x0062
            int r4 = r4 * r6
            int r1 = r4 / r2
            goto L_0x0052
        L_0x007a:
            r5.setMeasuredDimension(r0, r1)
            com.google.android.gms.internal.ads.zzcbz r6 = r5.zzo
            if (r6 == 0) goto L_0x0084
            r6.zzc(r0, r1)
        L_0x0084:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcbf.onMeasure(int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x005f A[LOOP:0: B:12:0x005f->B:17:0x007a, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPrepared(android.media.MediaPlayer r8) {
        /*
            r7 = this;
            java.lang.String r0 = "AdMediaPlayerView prepared"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            r0 = 2
            r7.zzF(r0)
            com.google.android.gms.internal.ads.zzccc r0 = r7.zze
            r0.zzb()
            com.google.android.gms.internal.ads.zzfrw r0 = com.google.android.gms.ads.internal.util.zzs.zza
            com.google.android.gms.internal.ads.zzcax r1 = new com.google.android.gms.internal.ads.zzcax
            r1.<init>(r7, r8)
            r0.post(r1)
            int r0 = r8.getVideoWidth()
            r7.zzl = r0
            int r8 = r8.getVideoHeight()
            r7.zzm = r8
            int r8 = r7.zzq
            if (r8 == 0) goto L_0x002b
            r7.zzq(r8)
        L_0x002b:
            boolean r8 = r7.zzf
            r0 = 3
            if (r8 != 0) goto L_0x0031
            goto L_0x0084
        L_0x0031:
            boolean r8 = r7.zzH()
            if (r8 == 0) goto L_0x0084
            android.media.MediaPlayer r8 = r7.zzj
            int r8 = r8.getCurrentPosition()
            if (r8 <= 0) goto L_0x0084
            int r8 = r7.zzi
            if (r8 == r0) goto L_0x0084
            java.lang.String r8 = "AdMediaPlayerView nudging MediaPlayer"
            com.google.android.gms.ads.internal.util.zze.zza(r8)
            r8 = 0
            r7.zzG(r8)
            android.media.MediaPlayer r8 = r7.zzj
            r8.start()
            android.media.MediaPlayer r8 = r7.zzj
            int r8 = r8.getCurrentPosition()
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzv.zzD()
            long r1 = r1.currentTimeMillis()
        L_0x005f:
            boolean r3 = r7.zzH()
            if (r3 == 0) goto L_0x007c
            android.media.MediaPlayer r3 = r7.zzj
            int r3 = r3.getCurrentPosition()
            if (r3 != r8) goto L_0x007c
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzv.zzD()
            long r3 = r3.currentTimeMillis()
            long r3 = r3 - r1
            r5 = 250(0xfa, double:1.235E-321)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x005f
        L_0x007c:
            android.media.MediaPlayer r8 = r7.zzj
            r8.pause()
            r7.zzn()
        L_0x0084:
            int r8 = r7.zzl
            int r1 = r7.zzm
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "AdMediaPlayerView stream dimensions: "
            r2.<init>(r3)
            r2.append(r8)
            java.lang.String r8 = " x "
            r2.append(r8)
            r2.append(r1)
            java.lang.String r8 = r2.toString()
            com.google.android.gms.ads.internal.util.client.zzo.zzi(r8)
            int r8 = r7.zzi
            if (r8 != r0) goto L_0x00a8
            r7.zzp()
        L_0x00a8:
            r7.zzn()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcbf.onPrepared(android.media.MediaPlayer):void");
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zze.zza("AdMediaPlayerView surface created");
        zzD();
        zzs.zza.post(new zzcba(this));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zze.zza("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null && this.zzq == 0) {
            this.zzq = mediaPlayer.getCurrentPosition();
        }
        zzcbz zzcbz = this.zzo;
        if (zzcbz != null) {
            zzcbz.zze();
        }
        zzs.zza.post(new zzcbc(this));
        zzE(true);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        zze.zza("AdMediaPlayerView surface changed");
        int i3 = this.zzi;
        boolean z = false;
        if (this.zzl == i && this.zzm == i2) {
            z = true;
        }
        if (this.zzj != null && i3 == 3 && z) {
            int i4 = this.zzq;
            if (i4 != 0) {
                zzq(i4);
            }
            zzp();
        }
        zzcbz zzcbz = this.zzo;
        if (zzcbz != null) {
            zzcbz.zzc(i, i2);
        }
        zzs.zza.post(new zzcbb(this, i, i2));
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zze.zzf(this);
        this.zza.zza(surfaceTexture, this.zzr);
    }

    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        zze.zza("AdMediaPlayerView size changed: " + i + " x " + i2);
        this.zzl = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.zzm = videoHeight;
        if (this.zzl != 0 && videoHeight != 0) {
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        zze.zza("AdMediaPlayerView window visibility changed to " + i);
        zzs.zza.post(new zzcaw(this, i));
        super.onWindowVisibilityChanged(i);
    }

    public final String toString() {
        String name = getClass().getName();
        String hexString = Integer.toHexString(hashCode());
        return name + "@" + hexString;
    }

    public final int zza() {
        if (zzH()) {
            return this.zzj.getCurrentPosition();
        }
        return 0;
    }

    public final int zzb() {
        if (zzH()) {
            return this.zzj.getMetrics().getInt("android.media.mediaplayer.dropped");
        }
        return -1;
    }

    public final int zzc() {
        if (zzH()) {
            return this.zzj.getDuration();
        }
        return -1;
    }

    public final int zzd() {
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    public final int zze() {
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    public final long zzf() {
        return 0;
    }

    public final long zzg() {
        if (this.zzt != null) {
            return (zzh() * ((long) this.zzn)) / 100;
        }
        return -1;
    }

    public final long zzh() {
        if (this.zzt != null) {
            return ((long) zzc()) * ((long) this.zzt.intValue());
        }
        return -1;
    }

    public final String zzj() {
        return "MediaPlayer".concat(true != this.zzp ? "" : " spherical");
    }

    public final void zzn() {
        zzG(this.zzb.zza());
    }

    public final void zzo() {
        zze.zza("AdMediaPlayerView pause");
        if (zzH() && this.zzj.isPlaying()) {
            this.zzj.pause();
            zzF(4);
            zzs.zza.post(new zzcbe(this));
        }
        this.zzi = 4;
    }

    public final void zzp() {
        zze.zza("AdMediaPlayerView play");
        if (zzH()) {
            this.zzj.start();
            zzF(3);
            this.zza.zzb();
            zzs.zza.post(new zzcbd(this));
        }
        this.zzi = 3;
    }

    public final void zzq(int i) {
        zze.zza("AdMediaPlayerView seek " + i);
        if (zzH()) {
            this.zzj.seekTo(i);
            this.zzq = 0;
            return;
        }
        this.zzq = i;
    }

    public final void zzr(zzcbg zzcbg) {
        this.zzr = zzcbg;
    }

    public final void zzs(String str) {
        Uri parse = Uri.parse(str);
        zzbbo zza = zzbbo.zza(parse);
        if (zza == null || zza.zza != null) {
            if (zza != null) {
                parse = Uri.parse(zza.zza);
            }
            this.zzk = parse;
            this.zzq = 0;
            zzD();
            requestLayout();
            invalidate();
        }
    }

    public final void zzt() {
        zze.zza("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.zzj.release();
            this.zzj = null;
            zzF(0);
            this.zzi = 0;
        }
        this.zze.zzd();
    }

    public final void zzu(float f, float f2) {
        zzcbz zzcbz = this.zzo;
        if (zzcbz != null) {
            zzcbz.zzf(f, f2);
        }
    }
}
