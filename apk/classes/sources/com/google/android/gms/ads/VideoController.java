package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzed;
import com.google.android.gms.ads.internal.client.zzgb;
import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class VideoController {
    public static final int PLAYBACK_STATE_ENDED = 3;
    public static final int PLAYBACK_STATE_PAUSED = 2;
    public static final int PLAYBACK_STATE_PLAYING = 1;
    public static final int PLAYBACK_STATE_READY = 5;
    public static final int PLAYBACK_STATE_UNKNOWN = 0;
    private final Object zza = new Object();
    private zzed zzb;
    private VideoLifecycleCallbacks zzc;

    /* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
    public static abstract class VideoLifecycleCallbacks {
        public void onVideoEnd() {
        }

        public void onVideoMute(boolean z) {
        }

        public void onVideoPause() {
        }

        public void onVideoPlay() {
        }

        public void onVideoStart() {
        }
    }

    public VideoLifecycleCallbacks getVideoLifecycleCallbacks() {
        VideoLifecycleCallbacks videoLifecycleCallbacks;
        synchronized (this.zza) {
            videoLifecycleCallbacks = this.zzc;
        }
        return videoLifecycleCallbacks;
    }

    public boolean hasVideoContent() {
        boolean z;
        synchronized (this.zza) {
            z = this.zzb != null;
        }
        return z;
    }

    public final zzed zza() {
        zzed zzed;
        synchronized (this.zza) {
            zzed = this.zzb;
        }
        return zzed;
    }

    public final void zzb(zzed zzed) {
        synchronized (this.zza) {
            this.zzb = zzed;
            VideoLifecycleCallbacks videoLifecycleCallbacks = this.zzc;
            if (videoLifecycleCallbacks != null) {
                setVideoLifecycleCallbacks(videoLifecycleCallbacks);
            }
        }
    }

    public int getPlaybackState() {
        synchronized (this.zza) {
            zzed zzed = this.zzb;
            if (zzed == null) {
                return 0;
            }
            try {
                int zzh = zzed.zzh();
                return zzh;
            } catch (RemoteException e) {
                zzo.zzh("Unable to call getPlaybackState on video controller.", e);
                return 0;
            }
        }
    }

    public boolean isClickToExpandEnabled() {
        synchronized (this.zza) {
            zzed zzed = this.zzb;
            if (zzed == null) {
                return false;
            }
            try {
                boolean zzo = zzed.zzo();
                return zzo;
            } catch (RemoteException e) {
                zzo.zzh("Unable to call isClickToExpandEnabled.", e);
                return false;
            }
        }
    }

    public boolean isCustomControlsEnabled() {
        synchronized (this.zza) {
            zzed zzed = this.zzb;
            if (zzed == null) {
                return false;
            }
            try {
                boolean zzp = zzed.zzp();
                return zzp;
            } catch (RemoteException e) {
                zzo.zzh("Unable to call isUsingCustomPlayerControls.", e);
                return false;
            }
        }
    }

    public boolean isMuted() {
        synchronized (this.zza) {
            zzed zzed = this.zzb;
            if (zzed == null) {
                return true;
            }
            try {
                boolean zzq = zzed.zzq();
                return zzq;
            } catch (RemoteException e) {
                zzo.zzh("Unable to call isMuted on video controller.", e);
                return true;
            }
        }
    }

    public void mute(boolean z) {
        synchronized (this.zza) {
            zzed zzed = this.zzb;
            if (zzed != null) {
                try {
                    zzed.zzj(z);
                } catch (RemoteException e) {
                    zzo.zzh("Unable to call mute on video controller.", e);
                }
            }
        }
    }

    public void pause() {
        synchronized (this.zza) {
            zzed zzed = this.zzb;
            if (zzed != null) {
                try {
                    zzed.zzk();
                } catch (RemoteException e) {
                    zzo.zzh("Unable to call pause on video controller.", e);
                }
            }
        }
    }

    public void play() {
        synchronized (this.zza) {
            zzed zzed = this.zzb;
            if (zzed != null) {
                try {
                    zzed.zzl();
                } catch (RemoteException e) {
                    zzo.zzh("Unable to call play on video controller.", e);
                }
            }
        }
    }

    public void stop() {
        synchronized (this.zza) {
            zzed zzed = this.zzb;
            if (zzed != null) {
                try {
                    zzed.zzn();
                } catch (RemoteException e) {
                    zzo.zzh("Unable to call stop on video controller.", e);
                }
            }
        }
    }

    public void setVideoLifecycleCallbacks(VideoLifecycleCallbacks videoLifecycleCallbacks) {
        zzgb zzgb;
        synchronized (this.zza) {
            this.zzc = videoLifecycleCallbacks;
            zzed zzed = this.zzb;
            if (zzed != null) {
                if (videoLifecycleCallbacks == null) {
                    zzgb = null;
                } else {
                    try {
                        zzgb = new zzgb(videoLifecycleCallbacks);
                    } catch (RemoteException e) {
                        zzo.zzh("Unable to call setVideoLifecycleCallbacks on video controller.", e);
                        return;
                    }
                }
                zzed.zzm(zzgb);
            }
        }
    }
}
