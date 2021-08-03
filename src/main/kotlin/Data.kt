@file:Suppress("unused")

package com.geno1024.ceedata

object Data
{
    object G101
    {
        object Summary
        {
            val year = (2020..2023)
            const val begin = 1360 // WxPub2020Ent
        }
    }

    object G100
    {
        object Summary
        {
            val year = (2019..2022)
            const val begin = 1456 // WxPub2019Ent
        }
    }

    object G99
    {
        object Summary
        {
            val year = (2018..2021)
            const val end = 1196 // WxPub2021Grad
            const val l1 = 955 // WxPub2021Grad
            const val lb = 1184 // WxPub2021Grad
            object MoreThan
            {
                const val score600 = 287 // WxPub2021Grad
            }
        }

        object Science
        {
            object T1
            {
                const val score = 678 // WxPub2021Grad
                const val pos = 311 // WxPub2021Grad
            }
        }

        object Art
        {
            object T1
            {
                const val score = 644 // WxPub2021Grad
                const val pos = 166 // WxPub2021Grad
            }
        }
    }

    object G98
    {
        object Summary
        {
            val year = (2017..2020)
            const val l1 = 942 // WxPub2020ThirdParty1
            object MoreThan
            {
                const val score600 = 209 // WxPub2021Grad, WxPub2020ThirdParty1
            }
        }

        object Science
        {
            object T1
            {
                const val score = 680 // WxPub2020ThirdParty1
                const val pos = 443 // WxPub2021Grad
            }
        }

        object Art
        {
            object T1
            {
                const val score = 623 // WxPub2020ThirdParty1
                const val pos = 349 // WxPub2021Grad
            }
        }
    }

    object G97
    {
        object Summary
        {
            val year = (2016..2019)
            const val end = 1254 // Baidu2019ThirdParty1
            const val l1 = 936 // Baidu2019ThirdParty1
            object MoreThan
            {
                const val score600 = 108 // WxPub2020ThirdParty1
                const val rank50 = 2 // WxPub2020Ent
            }
        }

        object Science
        {
            object MoreThan
            {
                const val score600 = 90 // Baidu2019ThirdParty1
            }
            object T1
            {
                const val score = 686 // WxPub2020Ent
                const val pos = 37 // WxPub2020Ent
            }
        }

        object Art
        {
            object MoreThan
            {
                const val score600 = 18 // Baidu2019ThirdParty1
            }
            object T1
            {
                const val score = 654 // WxPub2020Ent
                const val pos = 25 // WxPub2020Ent
            }
        }
    }

    object G96
    {
        object Summary
        {
            val year = (2015..2018)
        }

        object Science
        {
            object T1
            {
                const val score = 671 // WxPub2018ThirdParty1
            }
        }

        object Art
        {
            object T1
            {
                const val score = 653 // WxPub2018ThirdParty1
                const val pos = 32 // WxPub2018ThirdParty1
            }
        }
    }

    object G95
    {
        object Summary
        {
            val year = (2014..2017)
            const val end = 1563 // WxPub2017Grad
            const val l1 = 1023 // WxPub2017ThirdParty1, WxPub2017Grad
            const val lb = 1549 // WxPub2017Grad
            object MoreThan
            {
                const val rank500 = 10
            }
        }

        object Science
        {
            object T1
            {
                const val score = 676 // WxPub2017ThirdParty1
                const val pos = 41 // WxPub2017ThirdParty1
            }
        }

        object Art
        {
            object T1
            {
                const val score = 640 // WxPub2017ThirdParty1
                const val pos = 24 // WxPub2017ThirdParty1
            }
        }
    }

    object G94
    {
        object Summary
        {
            val year = (2013..2016)
            const val l1 = 957 // WxPub2017ThirdParty1
        }

        object Science
        {

        }

        object Art
        {

        }
    }

    object G93
    {
        object Summary
        {
            val year = (2012..2015)
            const val l1 = 905 // WxPub2017ThirdParty1
        }

        object Science
        {

        }

        object Art
        {

        }
    }

    object G92
    {
        object Summary
        {
            val year = (2011..2014)
        }

        object Science
        {

        }

        object Art
        {

        }
    }

    object G91
    {
        object Summary
        {
            val year = (2010..2013)
            const val end = 1678 // Baidu2013ThirdParty1
            const val l1 = 717 // Baidu2013ThirdParty1
            const val l2a = 1330 // Baidu2013ThirdParty1
            const val lb = 1536 // Baidu2013ThirdParty1
            object MoreThan
            {
                const val rank100 = 5 // Baidu2013ThirdParty1
            }
        }

        object Science
        {
            const val l1 = 611 // Baidu2013ThirdParty1
            object T1
            {
                const val score = 687 // Baidu2013ThirdParty1
            }
            object MoreThan
            {
                const val rank100 = 3 // Baidu2013ThirdParty1
            }
        }

        object Art
        {
            const val l1 = 106 // Baidu2013ThirdParty1
            object T1
            {
                const val score = 663 // Baidu2013ThirdParty1
            }
            object MoreThan
            {
                const val rank100 = 2 // Baidu2013ThirdParty1
            }
        }
    }

    object G90
    {
        object Summary
        {
            val year = (2009..2012)
            const val end = 1583 // Baidu2012ThirdParty1
            const val l1 = 539 // Baidu2013ThirdParty1, Baidu2012ThirdParty1
            const val l2a = 1182 // Baidu2012ThirdParty1
            const val lb = 1401 // Baidu2012ThirdParty1
        }

        object Science
        {
            object T1
            {
                const val score = 692 // Baidu2012ThirdParty1
                const val pos = 36 // Baidu2012ThirdParty1
            }
        }

        object Art
        {
            object T1
            {
                const val score = 658 // Baidu2012ThirdParty1
                const val pos = 56 // Baidu2012ThirdParty1
            }
        }
    }

    object G89
    {
        object Summary
        {
            val year = (2008..2011)
        }

        object Science
        {

        }

        object Art
        {

        }
    }

    object G88
    {
        object Summary
        {
            val year = (2007..2010)
        }

        object Science
        {

        }

        object Art
        {

        }
    }

    object G87
    {
        object Summary
        {
            val year = (2006..2009)
            const val end = 1429 // Baidu2009ThirdParty1
            const val l1 = 537 // Baidu2009ThirdParty1
            const val lb = 1175 // Baidu2009ThirdParty1
            object MoreThan
            {
                const val score645 = 35 // Baidu2009ThirdParty1
                const val score600 = 380 // Baidu2009ThirdParty1
            }
        }

        object Science
        {

        }

        object Art
        {

        }
    }

    object G86
    {
        object Summary
        {
            val year = (2005..2008)
            const val l1 = 537 - 130 // Baidu2009ThirdParty1
            const val lb = 1175 - 440 // Baidu2009ThirdParty1
            object MoreThan
            {
                const val score645 = 35 - 29 // Baidu2009ThirdParty1
                const val score600 = 380 - 220 // Baidu2009ThirdParty1
            }
        }

        object Science
        {

        }

        object Art
        {

        }
    }

    object DataSource
    {
        const val WxPub2021Grad: String = "https://mp.weixin.qq.com/s/1ws7QltfbqwtBY7UmmEsvA"
        const val WxPub2020Ent: String = "https://mp.weixin.qq.com/s/6XmcGyfvFcLS8XorVXH8bA"
        const val WxPub2020ThirdParty1: String = "https://mp.weixin.qq.com/s/WV20S2gd-FRaLnu-e79RUQ"
        const val WxPub2019Ent: String = "https://mp.weixin.qq.com/s/UFZ2FylFnqOuP7r_81bzsA"
        const val Baidu2019ThirdParty1: String = "https://tieba.baidu.com/p/6173262597"
        const val WxPub2018ThirdParty1: String = "https://mp.weixin.qq.com/s/KrOIO1Kq4xgkNwZQnzwqYw"
        const val WxPub2017Grad: String = "https://mp.weixin.qq.com/s/ZZEjMLjTk5PCdx_Tdu2BVQ"
        const val WxPub2017ThirdParty1: String = "https://mp.weixin.qq.com/s/-b5g85lLDpv8_npq97nTng"
        const val Baidu2013ThirdParty1: String = "https://zhidao.baidu.com/question/564452455.html"
        const val Baidu2012ThirdParty1: String = "https://zhidao.baidu.com/question/452505509.html"
        const val Baidu2009ThirdParty1: String = "https://zhidao.baidu.com/question/574238724.html"
    }
}
