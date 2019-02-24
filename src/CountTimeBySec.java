/**封装类: 秒转换为时间单位
 * 传秒来获得共x天x小时x分x秒
 * By Adler QQ1101635162
 */
public class CountTimeBySec {
    public String CountBySec(long sec) {
        long day = 0;
        long hour = 0;
        long minute = 0;
        /*
        60秒 = 1分钟 = 60s
        60分钟 = 1小时 = 3600s
        24小时 = 1天 = 86400s
         */
        //如果秒大于一天
        if (sec >= 86400) {
            System.out.println("符合天");
            //long相除如果有余数不会四舍五入, 而是丢弃
            day = sec / 86400; //得出天数
            sec = sec - (day * 86400); //从秒中减去已经计算的天数
        }
        System.out.println("计算天后, 还剩秒数" + sec + "需要计算.");
        //如果秒大于一小时
        if (sec >= 3600) {
            System.out.println("符合小时");
            hour = sec / 3600; //得出小时数
            sec = sec - (hour * 3600);
        }
        System.out.println("计算小时后, 还剩秒数" + sec + "需要计算.");
        //如果秒大于一分钟
        if (sec >= 60) {
            System.out.println("符合分钟");
            minute = sec / 60; //得出分钟数
            sec = sec - (minute * 60);
        }
        String result = "";
        //boolean为true时, 使用冒号分割, 可用split将返回的String分割为数组
        boolean canSplit = true;
        if (canSplit == true) {
            result = day + ":" + hour + ":" + minute + ":" + sec;
        } else {
            //语言为true时, 返回中文, 否则返回英文
            boolean inChinese = false;
            if (inChinese == true) {
                //拼接结果
                if (day != 0) {
                    result += day + " 天 ";
                }
                if (hour != 0) {
                    result += hour + " 时 ";
                }
                if (minute != 0) {
                    result += minute + " 分 ";
                }
                if (sec != 0) {
                    result += sec + " 秒";
                }
            } else {
                //拼接结果
                if (day != 0) {
                    result += day + " Day ";
                }
                if (hour != 0) {
                    result += hour + " Hour ";
                }
                if (minute != 0) {
                    result += minute + " Min ";
                }
                if (sec != 0) {
                    result += sec + " Sec";
                }
            }
        }
        return result;
    }

    //测试主方法
    /*public static void main(String[] args) {
        CountTimeBySec countTimeBySec = new CountTimeBySec();
        String get = countTimeBySec.CountBySec(259500);
        System.out.println(get);
        System.out.println((259200)/(86400));
    }*/
}