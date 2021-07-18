package com.company;

public class Five {
    //3.1
    WellManager - WellController
    EventManager - EventController
    SendNotification - NotficationSendler
    CheckPermission - Permissionchecker
    ExecuteRequest - ExecutorRequest
        
    //3.2
    fetchWellName - getWellName // в других методах используется get для получения
    WellService - WellServiceImpl // интерфейсы имеют обычное название, имплементации подпись impl 
    WellRepo - WellDao // все классы которые работают с бд, имеют преписку dao
    convertWellToDto - toDto // используется во всех сервисах, для конвертации в дто
    wellCustomLogicBeforePersist - customLogicBeforePersist
    wellAfterDeleteLogic - customLogicAfterDelete
    wellAfterCreateLogic- customLogicAfterCreate
    }
