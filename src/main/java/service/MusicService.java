package service;

/**
 * Created by Administrator on 2017/2/19.
 */
public interface MusicService {

    /**
     * 获取下载链接
     * @param id
     * @param quality
     * @return
     */
    public String getDownloadUrl(String id, String quality);



}
