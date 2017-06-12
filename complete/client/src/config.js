import pjson from './../package.json';

const prod = process.env.NODE_ENV === 'production'; //<1>
export const SERVER_URL = prod ? '' : 'http://localhost:8080';

export const CLIENT_VERSION = pjson.version;
export const REACT_VERSION = pjson.dependencies.react;
