package service.impl;

import com.alibaba.fastjson.JSONObject;
import music.util.NetEaseUtil;
import service.MusicService;

/**
 * Created by Administrator on 2017/2/19.
 */
public class NetEaseService implements MusicService {

    /**
     * 根据musicid，获取音乐下载链接
     *
     * @param id      id
     * @param quality 质量
     * @return 下载链接
     */
    @Override
    public String getDownloadUrl(String id, String quality) {
        String realQuality = "320000";
        String text = "{\"ids\":[\"" + id + "\"],\"br\":" + realQuality + ",\"csrf_token\":\"\"}";
        String html;
        html = NetEaseUtil.GetEncHtml("http://music.163.com/weapi/song/enhance/player/url?csrf_token=", text, true);
        JSONObject json = JSONObject.parseObject(html);
        if (json.getJSONArray("data").getJSONObject(0).getInteger("code") == 200) {
            return json.getJSONArray("data").getJSONObject(0).getString("url");
        } else {
            return "";
        }
    }

    public static void main(String[] args) {
        System.out.printf(new NetEaseService().getDownloadUrl("5412546", ""));
    }
}
