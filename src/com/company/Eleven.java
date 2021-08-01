package com.company;

public class Eleven {
    //связывание выполняется во время написания кода, путь котроллера он не меняется
    private final static String PATH = "api/news/";

    //связывание выполняется во время написания кода, запрос не меняется
    private final static String SQL_GET_ALL_WELL = "api/well/getall";

    //связывание выполняется во время работы программы, нужны объект достается из базы после через сериализуется от отправки
    String jsonEventWithWell = getEventWithWellJson(event);
}
