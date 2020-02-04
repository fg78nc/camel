/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.file.remote;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class FtpsEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        if (ignoreCase) {
            return doConfigureIgnoreCase(camelContext, target, name, value);
        } else {
            return doConfigure(camelContext, target, name, value);
        }
    }

    private static boolean doConfigure(CamelContext camelContext, Object target, String name, Object value) {
        switch (name) {
        case "binary": ((FtpsEndpoint) target).getConfiguration().setBinary(property(camelContext, boolean.class, value)); return true;
        case "charset": ((FtpsEndpoint) target).setCharset(property(camelContext, java.lang.String.class, value)); return true;
        case "disconnect": ((FtpsEndpoint) target).setDisconnect(property(camelContext, boolean.class, value)); return true;
        case "doneFileName": ((FtpsEndpoint) target).setDoneFileName(property(camelContext, java.lang.String.class, value)); return true;
        case "fileName": ((FtpsEndpoint) target).setFileName(property(camelContext, java.lang.String.class, value)); return true;
        case "passiveMode": ((FtpsEndpoint) target).getConfiguration().setPassiveMode(property(camelContext, boolean.class, value)); return true;
        case "separator": ((FtpsEndpoint) target).getConfiguration().setSeparator(property(camelContext, org.apache.camel.component.file.remote.RemoteFileConfiguration.PathSeparator.class, value)); return true;
        case "transferLoggingIntervalSeconds": ((FtpsEndpoint) target).setTransferLoggingIntervalSeconds(property(camelContext, int.class, value)); return true;
        case "transferLoggingLevel": ((FtpsEndpoint) target).setTransferLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "transferLoggingVerbose": ((FtpsEndpoint) target).setTransferLoggingVerbose(property(camelContext, boolean.class, value)); return true;
        case "fastExistsCheck": ((FtpsEndpoint) target).setFastExistsCheck(property(camelContext, boolean.class, value)); return true;
        case "bridgeErrorHandler": ((FtpsEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "delete": ((FtpsEndpoint) target).setDelete(property(camelContext, boolean.class, value)); return true;
        case "moveFailed": ((FtpsEndpoint) target).setMoveFailed(property(camelContext, java.lang.String.class, value)); return true;
        case "noop": ((FtpsEndpoint) target).setNoop(property(camelContext, boolean.class, value)); return true;
        case "preMove": ((FtpsEndpoint) target).setPreMove(property(camelContext, java.lang.String.class, value)); return true;
        case "preSort": ((FtpsEndpoint) target).setPreSort(property(camelContext, boolean.class, value)); return true;
        case "recursive": ((FtpsEndpoint) target).setRecursive(property(camelContext, boolean.class, value)); return true;
        case "resumeDownload": ((FtpsEndpoint) target).setResumeDownload(property(camelContext, boolean.class, value)); return true;
        case "sendEmptyMessageWhenIdle": ((FtpsEndpoint) target).setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "streamDownload": ((FtpsEndpoint) target).getConfiguration().setStreamDownload(property(camelContext, boolean.class, value)); return true;
        case "download": ((FtpsEndpoint) target).setDownload(property(camelContext, boolean.class, value)); return true;
        case "exceptionHandler": ((FtpsEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangePattern": ((FtpsEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "handleDirectoryParserAbsoluteResult": ((FtpsEndpoint) target).getConfiguration().setHandleDirectoryParserAbsoluteResult(property(camelContext, boolean.class, value)); return true;
        case "ignoreFileNotFoundOrPermissionError": ((FtpsEndpoint) target).getConfiguration().setIgnoreFileNotFoundOrPermissionError(property(camelContext, boolean.class, value)); return true;
        case "inProgressRepository": ((FtpsEndpoint) target).setInProgressRepository(property(camelContext, org.apache.camel.spi.IdempotentRepository.class, value)); return true;
        case "localWorkDirectory": ((FtpsEndpoint) target).setLocalWorkDirectory(property(camelContext, java.lang.String.class, value)); return true;
        case "onCompletionExceptionHandler": ((FtpsEndpoint) target).setOnCompletionExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "pollStrategy": ((FtpsEndpoint) target).setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "processStrategy": ((FtpsEndpoint) target).setProcessStrategy(property(camelContext, org.apache.camel.component.file.GenericFileProcessStrategy.class, value)); return true;
        case "useList": ((FtpsEndpoint) target).getConfiguration().setUseList(property(camelContext, boolean.class, value)); return true;
        case "fileExist": ((FtpsEndpoint) target).setFileExist(property(camelContext, org.apache.camel.component.file.GenericFileExist.class, value)); return true;
        case "flatten": ((FtpsEndpoint) target).setFlatten(property(camelContext, boolean.class, value)); return true;
        case "jailStartingDirectory": ((FtpsEndpoint) target).setJailStartingDirectory(property(camelContext, boolean.class, value)); return true;
        case "lazyStartProducer": ((FtpsEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "moveExisting": ((FtpsEndpoint) target).setMoveExisting(property(camelContext, java.lang.String.class, value)); return true;
        case "tempFileName": ((FtpsEndpoint) target).setTempFileName(property(camelContext, java.lang.String.class, value)); return true;
        case "tempPrefix": ((FtpsEndpoint) target).setTempPrefix(property(camelContext, java.lang.String.class, value)); return true;
        case "allowNullBody": ((FtpsEndpoint) target).setAllowNullBody(property(camelContext, boolean.class, value)); return true;
        case "chmod": ((FtpsEndpoint) target).getConfiguration().setChmod(property(camelContext, java.lang.String.class, value)); return true;
        case "disconnectOnBatchComplete": ((FtpsEndpoint) target).setDisconnectOnBatchComplete(property(camelContext, boolean.class, value)); return true;
        case "eagerDeleteTargetFile": ((FtpsEndpoint) target).setEagerDeleteTargetFile(property(camelContext, boolean.class, value)); return true;
        case "keepLastModified": ((FtpsEndpoint) target).setKeepLastModified(property(camelContext, boolean.class, value)); return true;
        case "moveExistingFileStrategy": ((FtpsEndpoint) target).setMoveExistingFileStrategy(property(camelContext, org.apache.camel.component.file.strategy.FileMoveExistingStrategy.class, value)); return true;
        case "sendNoop": ((FtpsEndpoint) target).getConfiguration().setSendNoop(property(camelContext, boolean.class, value)); return true;
        case "activePortRange": ((FtpsEndpoint) target).getConfiguration().setActivePortRange(property(camelContext, java.lang.String.class, value)); return true;
        case "autoCreate": ((FtpsEndpoint) target).setAutoCreate(property(camelContext, boolean.class, value)); return true;
        case "basicPropertyBinding": ((FtpsEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bufferSize": ((FtpsEndpoint) target).setBufferSize(property(camelContext, int.class, value)); return true;
        case "connectTimeout": ((FtpsEndpoint) target).getConfiguration().setConnectTimeout(property(camelContext, int.class, value)); return true;
        case "ftpClient": ((FtpsEndpoint) target).setFtpClient(property(camelContext, org.apache.commons.net.ftp.FTPClient.class, value)); return true;
        case "ftpClientConfig": ((FtpsEndpoint) target).setFtpClientConfig(property(camelContext, org.apache.commons.net.ftp.FTPClientConfig.class, value)); return true;
        case "ftpClientConfigParameters": ((FtpsEndpoint) target).setFtpClientConfigParameters(property(camelContext, java.util.Map.class, value)); return true;
        case "ftpClientParameters": ((FtpsEndpoint) target).setFtpClientParameters(property(camelContext, java.util.Map.class, value)); return true;
        case "maximumReconnectAttempts": ((FtpsEndpoint) target).setMaximumReconnectAttempts(property(camelContext, int.class, value)); return true;
        case "reconnectDelay": ((FtpsEndpoint) target).setReconnectDelay(property(camelContext, long.class, value)); return true;
        case "siteCommand": ((FtpsEndpoint) target).getConfiguration().setSiteCommand(property(camelContext, java.lang.String.class, value)); return true;
        case "soTimeout": ((FtpsEndpoint) target).getConfiguration().setSoTimeout(property(camelContext, int.class, value)); return true;
        case "stepwise": ((FtpsEndpoint) target).getConfiguration().setStepwise(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((FtpsEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "throwExceptionOnConnectFailed": ((FtpsEndpoint) target).getConfiguration().setThrowExceptionOnConnectFailed(property(camelContext, boolean.class, value)); return true;
        case "timeout": ((FtpsEndpoint) target).getConfiguration().setTimeout(property(camelContext, int.class, value)); return true;
        case "antExclude": ((FtpsEndpoint) target).setAntExclude(property(camelContext, java.lang.String.class, value)); return true;
        case "antFilterCaseSensitive": ((FtpsEndpoint) target).setAntFilterCaseSensitive(property(camelContext, boolean.class, value)); return true;
        case "antInclude": ((FtpsEndpoint) target).setAntInclude(property(camelContext, java.lang.String.class, value)); return true;
        case "eagerMaxMessagesPerPoll": ((FtpsEndpoint) target).setEagerMaxMessagesPerPoll(property(camelContext, boolean.class, value)); return true;
        case "exclude": ((FtpsEndpoint) target).setExclude(property(camelContext, java.lang.String.class, value)); return true;
        case "filter": ((FtpsEndpoint) target).setFilter(property(camelContext, org.apache.camel.component.file.GenericFileFilter.class, value)); return true;
        case "filterDirectory": ((FtpsEndpoint) target).setFilterDirectory(property(camelContext, java.lang.String.class, value)); return true;
        case "filterFile": ((FtpsEndpoint) target).setFilterFile(property(camelContext, java.lang.String.class, value)); return true;
        case "idempotent": ((FtpsEndpoint) target).setIdempotent(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "idempotentKey": ((FtpsEndpoint) target).setIdempotentKey(property(camelContext, java.lang.String.class, value)); return true;
        case "idempotentRepository": ((FtpsEndpoint) target).setIdempotentRepository(property(camelContext, org.apache.camel.spi.IdempotentRepository.class, value)); return true;
        case "include": ((FtpsEndpoint) target).setInclude(property(camelContext, java.lang.String.class, value)); return true;
        case "maxDepth": ((FtpsEndpoint) target).setMaxDepth(property(camelContext, int.class, value)); return true;
        case "maxMessagesPerPoll": ((FtpsEndpoint) target).setMaxMessagesPerPoll(property(camelContext, int.class, value)); return true;
        case "minDepth": ((FtpsEndpoint) target).setMinDepth(property(camelContext, int.class, value)); return true;
        case "move": ((FtpsEndpoint) target).setMove(property(camelContext, java.lang.String.class, value)); return true;
        case "exclusiveReadLockStrategy": ((FtpsEndpoint) target).setExclusiveReadLockStrategy(property(camelContext, org.apache.camel.component.file.GenericFileExclusiveReadLockStrategy.class, value)); return true;
        case "readLock": ((FtpsEndpoint) target).setReadLock(property(camelContext, java.lang.String.class, value)); return true;
        case "readLockCheckInterval": ((FtpsEndpoint) target).setReadLockCheckInterval(property(camelContext, long.class, value)); return true;
        case "readLockDeleteOrphanLockFiles": ((FtpsEndpoint) target).setReadLockDeleteOrphanLockFiles(property(camelContext, boolean.class, value)); return true;
        case "readLockLoggingLevel": ((FtpsEndpoint) target).setReadLockLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "readLockMarkerFile": ((FtpsEndpoint) target).setReadLockMarkerFile(property(camelContext, boolean.class, value)); return true;
        case "readLockMinAge": ((FtpsEndpoint) target).setReadLockMinAge(property(camelContext, long.class, value)); return true;
        case "readLockMinLength": ((FtpsEndpoint) target).setReadLockMinLength(property(camelContext, long.class, value)); return true;
        case "readLockRemoveOnCommit": ((FtpsEndpoint) target).setReadLockRemoveOnCommit(property(camelContext, boolean.class, value)); return true;
        case "readLockRemoveOnRollback": ((FtpsEndpoint) target).setReadLockRemoveOnRollback(property(camelContext, boolean.class, value)); return true;
        case "readLockTimeout": ((FtpsEndpoint) target).setReadLockTimeout(property(camelContext, long.class, value)); return true;
        case "backoffErrorThreshold": ((FtpsEndpoint) target).setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffIdleThreshold": ((FtpsEndpoint) target).setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffMultiplier": ((FtpsEndpoint) target).setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "delay": ((FtpsEndpoint) target).setDelay(property(camelContext, long.class, value)); return true;
        case "greedy": ((FtpsEndpoint) target).setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialDelay": ((FtpsEndpoint) target).setInitialDelay(property(camelContext, long.class, value)); return true;
        case "repeatCount": ((FtpsEndpoint) target).setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runLoggingLevel": ((FtpsEndpoint) target).setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledExecutorService": ((FtpsEndpoint) target).setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": ((FtpsEndpoint) target).setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerProperties": ((FtpsEndpoint) target).setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "startScheduler": ((FtpsEndpoint) target).setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "timeUnit": ((FtpsEndpoint) target).setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "useFixedDelay": ((FtpsEndpoint) target).setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
        case "shuffle": ((FtpsEndpoint) target).setShuffle(property(camelContext, boolean.class, value)); return true;
        case "sortBy": ((FtpsEndpoint) target).setSortBy(property(camelContext, java.lang.String.class, value)); return true;
        case "sorter": ((FtpsEndpoint) target).setSorter(property(camelContext, java.util.Comparator.class, value)); return true;
        case "account": ((FtpsEndpoint) target).getConfiguration().setAccount(property(camelContext, java.lang.String.class, value)); return true;
        case "disableSecureDataChannelDefaults": ((FtpsEndpoint) target).getConfiguration().setDisableSecureDataChannelDefaults(property(camelContext, boolean.class, value)); return true;
        case "execPbsz": ((FtpsEndpoint) target).getConfiguration().setExecPbsz(property(camelContext, java.lang.Long.class, value)); return true;
        case "execProt": ((FtpsEndpoint) target).getConfiguration().setExecProt(property(camelContext, java.lang.String.class, value)); return true;
        case "ftpClientKeyStoreParameters": ((FtpsEndpoint) target).setFtpClientKeyStoreParameters(property(camelContext, java.util.Map.class, value)); return true;
        case "ftpClientTrustStoreParameters": ((FtpsEndpoint) target).setFtpClientTrustStoreParameters(property(camelContext, java.util.Map.class, value)); return true;
        case "implicit": ((FtpsEndpoint) target).getConfiguration().setImplicit(property(camelContext, boolean.class, value)); return true;
        case "password": ((FtpsEndpoint) target).getConfiguration().setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "securityProtocol": ((FtpsEndpoint) target).getConfiguration().setSecurityProtocol(property(camelContext, java.lang.String.class, value)); return true;
        case "sslContextParameters": ((FtpsEndpoint) target).setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "username": ((FtpsEndpoint) target).getConfiguration().setUsername(property(camelContext, java.lang.String.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "binary": ((FtpsEndpoint) target).getConfiguration().setBinary(property(camelContext, boolean.class, value)); return true;
        case "charset": ((FtpsEndpoint) target).setCharset(property(camelContext, java.lang.String.class, value)); return true;
        case "disconnect": ((FtpsEndpoint) target).setDisconnect(property(camelContext, boolean.class, value)); return true;
        case "donefilename": ((FtpsEndpoint) target).setDoneFileName(property(camelContext, java.lang.String.class, value)); return true;
        case "filename": ((FtpsEndpoint) target).setFileName(property(camelContext, java.lang.String.class, value)); return true;
        case "passivemode": ((FtpsEndpoint) target).getConfiguration().setPassiveMode(property(camelContext, boolean.class, value)); return true;
        case "separator": ((FtpsEndpoint) target).getConfiguration().setSeparator(property(camelContext, org.apache.camel.component.file.remote.RemoteFileConfiguration.PathSeparator.class, value)); return true;
        case "transferloggingintervalseconds": ((FtpsEndpoint) target).setTransferLoggingIntervalSeconds(property(camelContext, int.class, value)); return true;
        case "transferlogginglevel": ((FtpsEndpoint) target).setTransferLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "transferloggingverbose": ((FtpsEndpoint) target).setTransferLoggingVerbose(property(camelContext, boolean.class, value)); return true;
        case "fastexistscheck": ((FtpsEndpoint) target).setFastExistsCheck(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler": ((FtpsEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "delete": ((FtpsEndpoint) target).setDelete(property(camelContext, boolean.class, value)); return true;
        case "movefailed": ((FtpsEndpoint) target).setMoveFailed(property(camelContext, java.lang.String.class, value)); return true;
        case "noop": ((FtpsEndpoint) target).setNoop(property(camelContext, boolean.class, value)); return true;
        case "premove": ((FtpsEndpoint) target).setPreMove(property(camelContext, java.lang.String.class, value)); return true;
        case "presort": ((FtpsEndpoint) target).setPreSort(property(camelContext, boolean.class, value)); return true;
        case "recursive": ((FtpsEndpoint) target).setRecursive(property(camelContext, boolean.class, value)); return true;
        case "resumedownload": ((FtpsEndpoint) target).setResumeDownload(property(camelContext, boolean.class, value)); return true;
        case "sendemptymessagewhenidle": ((FtpsEndpoint) target).setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "streamdownload": ((FtpsEndpoint) target).getConfiguration().setStreamDownload(property(camelContext, boolean.class, value)); return true;
        case "download": ((FtpsEndpoint) target).setDownload(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler": ((FtpsEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern": ((FtpsEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "handledirectoryparserabsoluteresult": ((FtpsEndpoint) target).getConfiguration().setHandleDirectoryParserAbsoluteResult(property(camelContext, boolean.class, value)); return true;
        case "ignorefilenotfoundorpermissionerror": ((FtpsEndpoint) target).getConfiguration().setIgnoreFileNotFoundOrPermissionError(property(camelContext, boolean.class, value)); return true;
        case "inprogressrepository": ((FtpsEndpoint) target).setInProgressRepository(property(camelContext, org.apache.camel.spi.IdempotentRepository.class, value)); return true;
        case "localworkdirectory": ((FtpsEndpoint) target).setLocalWorkDirectory(property(camelContext, java.lang.String.class, value)); return true;
        case "oncompletionexceptionhandler": ((FtpsEndpoint) target).setOnCompletionExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "pollstrategy": ((FtpsEndpoint) target).setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "processstrategy": ((FtpsEndpoint) target).setProcessStrategy(property(camelContext, org.apache.camel.component.file.GenericFileProcessStrategy.class, value)); return true;
        case "uselist": ((FtpsEndpoint) target).getConfiguration().setUseList(property(camelContext, boolean.class, value)); return true;
        case "fileexist": ((FtpsEndpoint) target).setFileExist(property(camelContext, org.apache.camel.component.file.GenericFileExist.class, value)); return true;
        case "flatten": ((FtpsEndpoint) target).setFlatten(property(camelContext, boolean.class, value)); return true;
        case "jailstartingdirectory": ((FtpsEndpoint) target).setJailStartingDirectory(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer": ((FtpsEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "moveexisting": ((FtpsEndpoint) target).setMoveExisting(property(camelContext, java.lang.String.class, value)); return true;
        case "tempfilename": ((FtpsEndpoint) target).setTempFileName(property(camelContext, java.lang.String.class, value)); return true;
        case "tempprefix": ((FtpsEndpoint) target).setTempPrefix(property(camelContext, java.lang.String.class, value)); return true;
        case "allownullbody": ((FtpsEndpoint) target).setAllowNullBody(property(camelContext, boolean.class, value)); return true;
        case "chmod": ((FtpsEndpoint) target).getConfiguration().setChmod(property(camelContext, java.lang.String.class, value)); return true;
        case "disconnectonbatchcomplete": ((FtpsEndpoint) target).setDisconnectOnBatchComplete(property(camelContext, boolean.class, value)); return true;
        case "eagerdeletetargetfile": ((FtpsEndpoint) target).setEagerDeleteTargetFile(property(camelContext, boolean.class, value)); return true;
        case "keeplastmodified": ((FtpsEndpoint) target).setKeepLastModified(property(camelContext, boolean.class, value)); return true;
        case "moveexistingfilestrategy": ((FtpsEndpoint) target).setMoveExistingFileStrategy(property(camelContext, org.apache.camel.component.file.strategy.FileMoveExistingStrategy.class, value)); return true;
        case "sendnoop": ((FtpsEndpoint) target).getConfiguration().setSendNoop(property(camelContext, boolean.class, value)); return true;
        case "activeportrange": ((FtpsEndpoint) target).getConfiguration().setActivePortRange(property(camelContext, java.lang.String.class, value)); return true;
        case "autocreate": ((FtpsEndpoint) target).setAutoCreate(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding": ((FtpsEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "buffersize": ((FtpsEndpoint) target).setBufferSize(property(camelContext, int.class, value)); return true;
        case "connecttimeout": ((FtpsEndpoint) target).getConfiguration().setConnectTimeout(property(camelContext, int.class, value)); return true;
        case "ftpclient": ((FtpsEndpoint) target).setFtpClient(property(camelContext, org.apache.commons.net.ftp.FTPClient.class, value)); return true;
        case "ftpclientconfig": ((FtpsEndpoint) target).setFtpClientConfig(property(camelContext, org.apache.commons.net.ftp.FTPClientConfig.class, value)); return true;
        case "ftpclientconfigparameters": ((FtpsEndpoint) target).setFtpClientConfigParameters(property(camelContext, java.util.Map.class, value)); return true;
        case "ftpclientparameters": ((FtpsEndpoint) target).setFtpClientParameters(property(camelContext, java.util.Map.class, value)); return true;
        case "maximumreconnectattempts": ((FtpsEndpoint) target).setMaximumReconnectAttempts(property(camelContext, int.class, value)); return true;
        case "reconnectdelay": ((FtpsEndpoint) target).setReconnectDelay(property(camelContext, long.class, value)); return true;
        case "sitecommand": ((FtpsEndpoint) target).getConfiguration().setSiteCommand(property(camelContext, java.lang.String.class, value)); return true;
        case "sotimeout": ((FtpsEndpoint) target).getConfiguration().setSoTimeout(property(camelContext, int.class, value)); return true;
        case "stepwise": ((FtpsEndpoint) target).getConfiguration().setStepwise(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((FtpsEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "throwexceptiononconnectfailed": ((FtpsEndpoint) target).getConfiguration().setThrowExceptionOnConnectFailed(property(camelContext, boolean.class, value)); return true;
        case "timeout": ((FtpsEndpoint) target).getConfiguration().setTimeout(property(camelContext, int.class, value)); return true;
        case "antexclude": ((FtpsEndpoint) target).setAntExclude(property(camelContext, java.lang.String.class, value)); return true;
        case "antfiltercasesensitive": ((FtpsEndpoint) target).setAntFilterCaseSensitive(property(camelContext, boolean.class, value)); return true;
        case "antinclude": ((FtpsEndpoint) target).setAntInclude(property(camelContext, java.lang.String.class, value)); return true;
        case "eagermaxmessagesperpoll": ((FtpsEndpoint) target).setEagerMaxMessagesPerPoll(property(camelContext, boolean.class, value)); return true;
        case "exclude": ((FtpsEndpoint) target).setExclude(property(camelContext, java.lang.String.class, value)); return true;
        case "filter": ((FtpsEndpoint) target).setFilter(property(camelContext, org.apache.camel.component.file.GenericFileFilter.class, value)); return true;
        case "filterdirectory": ((FtpsEndpoint) target).setFilterDirectory(property(camelContext, java.lang.String.class, value)); return true;
        case "filterfile": ((FtpsEndpoint) target).setFilterFile(property(camelContext, java.lang.String.class, value)); return true;
        case "idempotent": ((FtpsEndpoint) target).setIdempotent(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "idempotentkey": ((FtpsEndpoint) target).setIdempotentKey(property(camelContext, java.lang.String.class, value)); return true;
        case "idempotentrepository": ((FtpsEndpoint) target).setIdempotentRepository(property(camelContext, org.apache.camel.spi.IdempotentRepository.class, value)); return true;
        case "include": ((FtpsEndpoint) target).setInclude(property(camelContext, java.lang.String.class, value)); return true;
        case "maxdepth": ((FtpsEndpoint) target).setMaxDepth(property(camelContext, int.class, value)); return true;
        case "maxmessagesperpoll": ((FtpsEndpoint) target).setMaxMessagesPerPoll(property(camelContext, int.class, value)); return true;
        case "mindepth": ((FtpsEndpoint) target).setMinDepth(property(camelContext, int.class, value)); return true;
        case "move": ((FtpsEndpoint) target).setMove(property(camelContext, java.lang.String.class, value)); return true;
        case "exclusivereadlockstrategy": ((FtpsEndpoint) target).setExclusiveReadLockStrategy(property(camelContext, org.apache.camel.component.file.GenericFileExclusiveReadLockStrategy.class, value)); return true;
        case "readlock": ((FtpsEndpoint) target).setReadLock(property(camelContext, java.lang.String.class, value)); return true;
        case "readlockcheckinterval": ((FtpsEndpoint) target).setReadLockCheckInterval(property(camelContext, long.class, value)); return true;
        case "readlockdeleteorphanlockfiles": ((FtpsEndpoint) target).setReadLockDeleteOrphanLockFiles(property(camelContext, boolean.class, value)); return true;
        case "readlocklogginglevel": ((FtpsEndpoint) target).setReadLockLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "readlockmarkerfile": ((FtpsEndpoint) target).setReadLockMarkerFile(property(camelContext, boolean.class, value)); return true;
        case "readlockminage": ((FtpsEndpoint) target).setReadLockMinAge(property(camelContext, long.class, value)); return true;
        case "readlockminlength": ((FtpsEndpoint) target).setReadLockMinLength(property(camelContext, long.class, value)); return true;
        case "readlockremoveoncommit": ((FtpsEndpoint) target).setReadLockRemoveOnCommit(property(camelContext, boolean.class, value)); return true;
        case "readlockremoveonrollback": ((FtpsEndpoint) target).setReadLockRemoveOnRollback(property(camelContext, boolean.class, value)); return true;
        case "readlocktimeout": ((FtpsEndpoint) target).setReadLockTimeout(property(camelContext, long.class, value)); return true;
        case "backofferrorthreshold": ((FtpsEndpoint) target).setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffidlethreshold": ((FtpsEndpoint) target).setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffmultiplier": ((FtpsEndpoint) target).setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "delay": ((FtpsEndpoint) target).setDelay(property(camelContext, long.class, value)); return true;
        case "greedy": ((FtpsEndpoint) target).setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialdelay": ((FtpsEndpoint) target).setInitialDelay(property(camelContext, long.class, value)); return true;
        case "repeatcount": ((FtpsEndpoint) target).setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runlogginglevel": ((FtpsEndpoint) target).setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledexecutorservice": ((FtpsEndpoint) target).setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": ((FtpsEndpoint) target).setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerproperties": ((FtpsEndpoint) target).setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "startscheduler": ((FtpsEndpoint) target).setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "timeunit": ((FtpsEndpoint) target).setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "usefixeddelay": ((FtpsEndpoint) target).setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
        case "shuffle": ((FtpsEndpoint) target).setShuffle(property(camelContext, boolean.class, value)); return true;
        case "sortby": ((FtpsEndpoint) target).setSortBy(property(camelContext, java.lang.String.class, value)); return true;
        case "sorter": ((FtpsEndpoint) target).setSorter(property(camelContext, java.util.Comparator.class, value)); return true;
        case "account": ((FtpsEndpoint) target).getConfiguration().setAccount(property(camelContext, java.lang.String.class, value)); return true;
        case "disablesecuredatachanneldefaults": ((FtpsEndpoint) target).getConfiguration().setDisableSecureDataChannelDefaults(property(camelContext, boolean.class, value)); return true;
        case "execpbsz": ((FtpsEndpoint) target).getConfiguration().setExecPbsz(property(camelContext, java.lang.Long.class, value)); return true;
        case "execprot": ((FtpsEndpoint) target).getConfiguration().setExecProt(property(camelContext, java.lang.String.class, value)); return true;
        case "ftpclientkeystoreparameters": ((FtpsEndpoint) target).setFtpClientKeyStoreParameters(property(camelContext, java.util.Map.class, value)); return true;
        case "ftpclienttruststoreparameters": ((FtpsEndpoint) target).setFtpClientTrustStoreParameters(property(camelContext, java.util.Map.class, value)); return true;
        case "implicit": ((FtpsEndpoint) target).getConfiguration().setImplicit(property(camelContext, boolean.class, value)); return true;
        case "password": ((FtpsEndpoint) target).getConfiguration().setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "securityprotocol": ((FtpsEndpoint) target).getConfiguration().setSecurityProtocol(property(camelContext, java.lang.String.class, value)); return true;
        case "sslcontextparameters": ((FtpsEndpoint) target).setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "username": ((FtpsEndpoint) target).getConfiguration().setUsername(property(camelContext, java.lang.String.class, value)); return true;
            default: return false;
        }
    }

}
