package com.gjjf.commonservice.message.biz.impl;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gjjf.commonservice.message.biz.CommonService;
import com.gjjf.commonservice.message.util.MD5Util;

@Component
public class CommonServiceImpl implements CommonService {

	private static final String RANDOM_CODE = "randon_code";
	private static Logger logger = LoggerFactory.getLogger(CommonServiceImpl.class);

//	@Autowired
//	private StringRedisTemplate stringRedisTemplate;
//
//	@Resource(name = "stringRedisTemplate")
//	private ValueOperations<String, String> valueOps;

	public void getValidCode(HttpServletRequest request, HttpServletResponse response) {
		try {
			response.setHeader("Pragma", "No-cache");
			response.setHeader("Cache-Control", "no-cache");
			response.setDateHeader("Expires", 0L);
			response.setContentType("image/jpeg");

			int width = 60;
			int height = 20;
			BufferedImage image = new BufferedImage(width, height, 1);

			Graphics g = image.getGraphics();

			Random random = new Random();

			g.setColor(getRandColor(155, 254));

			g.fillRect(0, 0, width, height);

			g.setFont(new Font("Times New Roman", 0, 18));

			g.setColor(getRandColor(160, 220));
			for (int i = 0; i < 155; i++) {
				int x = random.nextInt(width);
				int y = random.nextInt(height);
				int xl = random.nextInt(12);
				int yl = random.nextInt(12);
				g.drawLine(x, y, x + xl, y + yl);
			}
			String sRand = "";
			for (int i = 0; i < 4; i++) {
				String rand = String.valueOf(random.nextInt(10));
				sRand = sRand + rand;

				g.setColor(new Color(20 + random.nextInt(110), 20 + random.nextInt(110), 20 + random.nextInt(110)));
				g.drawString(rand, 13 * i + 6, 16);
			}

			String clientIp = request.getRemoteHost();

			String rcode = MD5Util.encode2hex("randon_code" + clientIp);
//			this.valueOps.set(rcode, sRand);
//			this.stringRedisTemplate.expire(rcode, this.msgConfig.getRandCodeExpire(), TimeUnit.SECONDS);

			g.dispose();

			ServletOutputStream os = response.getOutputStream();
			ImageIO.write(image, "jpeg", os);
			os.flush();
			os.close();

			response.flushBuffer();
		} catch (Exception e) {
			e = e;
			logger.error("获取图形验证码", e);
		} finally {
		}
	}

	public boolean validateCode(String paramString1, String paramString2) {
		// TODO Auto-generated method stub
		return false;
	}

	private static Color getRandColor(int fc0, int bc0) {
		Random random = new Random();

		int fc = fc0;
		int bc = bc0;

		if (fc > 255) {
			fc = 255;
		}
		if (bc > 255) {
			bc = 255;
		}
		int r = fc + random.nextInt(bc - fc);
		int g = fc + random.nextInt(bc - fc);
		int b = fc + random.nextInt(bc - fc);
		return new Color(r, g, b);
	}

}
