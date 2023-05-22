import java.util.HashMap;
import java.util.Map;

public class DictionaryImpl implements Dictionary {
    public Map<String, String> getDictionary() {
        return dictionaryWords();
    }

    private Map<String, String> dictionaryWords() {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("АВАРИЯ", "Повреждение, выход из строя какого-н. механизма, машины,устройства во время работы, движения.");
        dictionary.put("БАГАЖНИК", "Вместилище в автомобиле, приспособление у велосипеда, мотоцикла для перевозки поклажи.");
        dictionary.put("ВЫНОСКА", "Примечание к тексту, а также сноска.");
        dictionary.put("КАБИНЕТ", "Комната для занятий, работы.");
        dictionary.put("ЕРАЛАШ", "Беспорядок, путаница (разг.).");
        dictionary.put("ЗАБВЕНИЕ", "Утрата памяти о чем-н.");
        dictionary.put("ДВОЙНИК", "Человек, имеющий полное сходство с другим.");
        dictionary.put("ГЛАШАТАЙ", "В старину: вестник, всенародно объявляющий,возвещающий что-н.");
        dictionary.put("ЖЕЛУДОК", "Орган пищеварения - расширенный отдел пищеварительного канала, следующий за пищеводом.");
        dictionary.put("ИОНОСФЕРА", "Верхний слой земной атмосферы, содержащий большое число ионов и свободных электронов.");
        dictionary.put("ЛАЗУТЧИК", "Разведчик (преимущ. в тылу противника).");
        dictionary.put("МАГНИТОЛА", "Аппарат, соединяющий в себе радиоприемник и магнитофон.");
        dictionary.put("НАРОД", "Население государства, жители страны.");
        dictionary.put("ОБАЯНИЕ", "Очарование, притягательная сила.");
        return dictionary;
    }
}
