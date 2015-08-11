package net.ofd.soi.util;

import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import net.ofd.soi.SOI;
import net.ofd.soi.card.Card;
import net.ofd.soi.game.CardRegistry;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class DataFileHelper {
	public static void writeCardDataToJsonFile(String fileName) {
		writeCardDataToJsonFile(new File(fileName));
	}

	public static void writeCardDataToJsonFile(File file) {
		JsonWriter jsonWriter;
		try {
			jsonWriter = new JsonWriter(new FileWriter(file));
			jsonWriter.setIndent("  ");
			jsonWriter.beginObject();
			for (String c : CardRegistry.getCustomCards().keySet()) {
				if (c != null && CardRegistry.getCardByName(c) != null) {
					SOI.gson.toJson(CardRegistry.getCardByName(c).getCardType().getCardClass().cast(CardRegistry.getCardByName(c)), CardRegistry.getCardByName(c).getCardType().getCardClass(), jsonWriter.name(c));
				}
			}
			jsonWriter.endObject();
			jsonWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Map<String, Card> readCardDataFromJsonFile(File file) {
		Map<String, Card> out = new HashMap<>();
		JsonReader jsonReader;
		try {
			jsonReader = new JsonReader(new FileReader(file));
			jsonReader.beginObject();
			while (jsonReader.hasNext()) {
				String name = jsonReader.nextName();

				JsonObject json = SOI.gson.fromJson(jsonReader, JsonObject.class);
				Card cardGeneric = SOI.gson.fromJson(json, Card.class);
				Class<? extends Card> cardClass = cardGeneric.getCardType().getCardClass();
				Card card = SOI.gson.fromJson(json, cardClass);
				out.put(name, card);
			}
			jsonReader.endObject();
			jsonReader.close();
		} catch (FileNotFoundException ignored) {

		} catch (IOException e) {
			e.printStackTrace();
		}
		return out;
	}

	public static Map<String, Card> readCardDataFromJsonFile(String file) {
		return readCardDataFromJsonFile(new File(file));
	}
}
