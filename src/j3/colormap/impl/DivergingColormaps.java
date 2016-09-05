package j3.colormap.impl;

import java.util.Arrays;
import java.util.List;

import j3.colormap.Colormap;
import j3.colormap.ColormapProvider;
import j3.colormap.LinearSequentialColormap;

public class DivergingColormaps implements ColormapProvider {

	@Override
	public String getCategory() {
		return "Diverging";
	}

	@Override
	public List<String> getNames() {
		return Arrays.asList(new String[] {
				"RdBu"
		});
	}

	@Override
	public Colormap getColormap(String name) {
		switch (name) {
		case "RdBu":
			return new LinearSequentialColormap(
					new double[][] {
						    {0.40392156862745099,  0.0                ,  0.12156862745098039},
						    {0.69803921568627447,  0.09411764705882353,  0.16862745098039217},
						    {0.83921568627450982,  0.37647058823529411,  0.30196078431372547},
						    {0.95686274509803926,  0.6470588235294118 ,  0.50980392156862742},
						    {0.99215686274509807,  0.85882352941176465,  0.7803921568627451 },
						    {0.96862745098039216,  0.96862745098039216,  0.96862745098039216},
						    {0.81960784313725488,  0.89803921568627454,  0.94117647058823528},
						    {0.5725490196078431 ,  0.77254901960784317,  0.87058823529411766},
						    {0.2627450980392157 ,  0.57647058823529407,  0.76470588235294112},
						    {0.12941176470588237,  0.4                ,  0.67450980392156867},
						    {0.0196078431372549 ,  0.18823529411764706,  0.38039215686274508}});
		default:
			throw new IllegalArgumentException(getClass().getName() + " does not support colormap '" + name + "'");
		}
	}

}